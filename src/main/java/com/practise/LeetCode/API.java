package com.practise.LeetCode;

import ch.qos.logback.classic.spi.LoggingEventVO;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;

public class API {



    @Autowired
    private  RestTemplate restTemplate;

    @Autowired
    private static WebClient.Builder webClientBuilder;

    public static void main(String[] args) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        String url = "https://gorest.co.in/public/v1/posts";

        HttpEntity request = new HttpEntity(url,httpHeaders);

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response.getBody());
      //  System.out.println(jsonNode);

        String webClient = WebClient.builder().build().get().uri(url).retrieve().bodyToMono(String.class).block();
        System.out.println(webClient);

        String ww = webClientBuilder.build().get().uri(url).retrieve().bodyToMono(String.class).block();
        System.out.println(ww);

      ObjectMapper objectMapper1 = new ObjectMapper();

      JsonNode jsonNode1 = objectMapper1.readTree(ww);

    }
}

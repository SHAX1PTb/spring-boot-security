package com.practise.Company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

  @Test
  public void displayTest() throws JsonProcessingException {

    PostContent postContent = new PostContent();
 //   Section section = new Section();

    Paragraph p0 = new Paragraph();
    Paragraph p1 = new Paragraph();
    Paragraph p2 = new Paragraph();
//    Section s0 = new Section();
//    Section s1 = new Section();
//    Section s2 = new Section();

    p0.setId("p0");
    p0.setText("aaa");

    p1.setId("p1");
    p1.setText("bbb");

    p2.setId("p2");
    p2.setText("ccc");

//    s0.setId("s0");
//    s0.setStartIndex(0);
//
//    s1.setId("s1");
//    s1.setStartIndex(2);
//
//    s2.setId("s2");
//    s2.setStartIndex(4);

    Paragraph[] paragraphs = new Paragraph[3];
    Section[] sections = {new Section("s0",0),new Section("s1",1),new Section("s2",2)};

    paragraphs[0] = p0;
    paragraphs[1] = p1;
    paragraphs[2] = p2;
//    sections[0] = s0;
//    sections[1] = s1;
//    sections[2] = s2;

    postContent.setParagraphs(paragraphs);
    postContent.setSections(sections);

      Solution ss = new Solution();

//    System.out.println(Arrays.toString(sections));
//    System.out.println(Arrays.toString(paragraphs));

      JSONObject messageJSON = new JSONObject();
      JSONObject postContentJSON = new JSONObject();
      JSONArray sectionObject = new JSONArray();
      JSONArray paragraphObject = new JSONArray();
      JSONObject sectionItem = new JSONObject();
      JSONObject sectionItem1 = new JSONObject();
      JSONObject sectionItem2 = new JSONObject();
      JSONObject sectionItem3 = new JSONObject();
      JSONObject paragraphItem = new JSONObject();
      JSONObject paragraphItem1 = new JSONObject();
      JSONObject paragraphItem2 = new JSONObject();
      JSONObject paragraphItem3 = new JSONObject();
      JSONObject paragraphItem4 = new JSONObject();
      JSONObject paragraphItem5 = new JSONObject();
      JSONObject paragraphItem6 = new JSONObject();
      sectionItem1.put("id","s0");
      sectionItem1.put("startIndex",0);

      sectionItem2.put("id","s1");
      sectionItem2.put("startIndex",2);

      sectionItem3.put("id","s2");
      sectionItem3.put("startIndex",4);

      paragraphItem1.put("id","p0");
      paragraphItem1.put("text","aaa");

//      paragraphItem1.put("",new Paragraph("p0","aaa"));

      paragraphItem2.put("id","p1");
      paragraphItem2.put("text","bbb");

      paragraphItem3.put("id","p2");
      paragraphItem3.put("text","ccc");

      paragraphItem4.put("id","p3");
      paragraphItem4.put("text","ddd");

      paragraphItem5.put("id","p4");
      paragraphItem5.put("text","eee");

      paragraphItem6.put("id","p5");
      paragraphItem6.put("text","fff");

//      paragraphItem.put("p0","aaa");
//      paragraphItem.put("p1","bbb");
//      paragraphItem.put("p2","ccc");
//      paragraphItem.put("p3","ddd");
//      paragraphItem.put("p4","eee");
//      paragraphItem.put("p5","fff");

      sectionObject.put(sectionItem1);
      sectionObject.put(sectionItem2);
      sectionObject.put(sectionItem3);
      paragraphObject.put(paragraphItem1);
      paragraphObject.put(paragraphItem2);
      paragraphObject.put(paragraphItem3);
      paragraphObject.put(paragraphItem4);
      paragraphObject.put(paragraphItem5);
      paragraphObject.put(paragraphItem6);
      postContentJSON.put("paragraph",paragraphObject);
      postContentJSON.put("sections",sectionObject);

//      sectionObject.put("sections:",Arrays.toString(sections));
//      sectionObject.put("paragraph:",Arrays.toString(paragraphs));

//      jsonObject.put("postcontent",sectionObject);

      messageJSON.put("postContent",postContentJSON);
      ObjectMapper objectMapper = new ObjectMapper();
    //System.out.println(postContentJSON);
   // System.out.println("postContent="+postContentJSON);
//    System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(messageJSON));
      var message = "postContentString:{\"paragraphs\":[{\"id\":\"p0\",\"text\":\"aaa\"},{\"id\":\"p1\",\"text\":\"bbb\"},{\"id\":\"p2\",\"text\":\"ccc\"},{\"id\":\"p3\",\"text\":\"ddd\"},{\"id\":\"p4\",\"text\":\"eee\"},{\"id\":\"p5\",\"text\":\"fff\"}],\"sections\":[{\"startIndex\":0,\"id\":\"s0\"},{\"startIndex\":2,\"id\":\"s1\"},{\"startIndex\":4,\"id\":\"s2\"}]}";
      var message1 = "{\"paragraphs\":[{\"id\":\"p0\",\"text\":\"aaa\"},{\"id\":\"p1\",\"text\":\"bbb\"},{\"id\":\"p2\",\"text\":\"ccc\"},{\"id\":\"p3\",\"text\":\"ddd\"},{\"id\":\"p4\",\"text\":\"eee\"},{\"id\":\"p5\",\"text\":\"fff\"}],\"sections\":[{\"startIndex\":0,\"id\":\"s0\"},{\"startIndex\":2,\"id\":\"s1\"},{\"startIndex\":4,\"id\":\"s2\"}]}";

//      Solution.solution("postContent="+postContentJSON.toString());
      Solution.solution(message);


  }
}

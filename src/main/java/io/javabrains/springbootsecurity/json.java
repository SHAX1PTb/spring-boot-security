package io.javabrains.springbootsecurity;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class json {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();

        obj.put("Name","Shankar");

        System.out.println(obj);

        String s="{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";

        Object obj2 = JSONValue.parse(s);

        JSONObject oobj = (JSONObject) obj2;

        System.out.println(oobj.get("name"));


    }
}

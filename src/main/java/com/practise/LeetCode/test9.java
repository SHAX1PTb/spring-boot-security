package com.practise.LeetCode;

import java.nio.charset.StandardCharsets;

public class test9 {
    public static void main(String[] args) {

        char[] abc = {'h','e','l','l','o'};
        String a = "Geeks for Geeks";
        String r= "";

        byte[] b = a.getBytes();


        for(int i = 0;i<abc.length;i++){
       //     System.out.println(abc[(abc.length-1) -i]);
        }

      //  System.out.println(new String(b));

        char ch;

        for(int i=0;i<a.length();i++){

            r = r+a.charAt((a.length()-1)-i);

        }

        System.out.println(r);


    }
}

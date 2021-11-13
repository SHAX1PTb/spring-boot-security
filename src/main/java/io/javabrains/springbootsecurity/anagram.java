package io.javabrains.springbootsecurity;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {
        String s = "anagram";
        String d = "anagram";
        String t = "nagaram";

        char[] aa = s.toCharArray();
        char[] bb = t.toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);

       int cc =Arrays.compare(aa,bb);
        if(cc == 0){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        if(aa.equals(d)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

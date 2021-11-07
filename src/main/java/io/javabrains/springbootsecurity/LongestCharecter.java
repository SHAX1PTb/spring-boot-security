package io.javabrains.springbootsecurity;

import java.util.HashMap;
import java.util.Map;

public class LongestCharecter {

    public static void main(String[] args) {
        String a = "abcda";

        Map<Character,Integer> map = new HashMap<>();
        int max =0;
        for(int i =0,j=0;i<a.length();i++){


            if(map.containsKey(a.charAt(i))){

                j = Math.max(j,map.get(a.charAt(i))+1);
            }
            map.put(a.charAt(i),i);
            System.out.println("i"+i);
            System.out.println("j"+j);
            max = Math.max(max,i-j+1);



        }

        System.out.println(max);
    }
}

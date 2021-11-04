package io.javabrains.springbootsecurity;

public class palindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String t = "amanaplanacanalpanama";

        String aExtract = s.replaceAll("[^A-Za-z]","");
     //   System.out.println(aExtract);


        Boolean anagram = determineAnagram(aExtract,t);
        System.out.println(anagram);

    }

    private static Boolean determineAnagram(String aExtract, String t) {
        String temp = "";
        String s=aExtract;
        System.out.println(s);
        for(int i=0 ; i <s.length();i++){
           // temp = temp+s.charAt([s.length()-1-i]);
            temp = temp + s.charAt(s.length() - 1 - i);
        }

      //  System.out.println("String1:"+temp);
     //   System.out.println("String2:"+t);

        if(temp.equalsIgnoreCase(t)){
            return true;
        }else{
            return false;
        }
    }
}

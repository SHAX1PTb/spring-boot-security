package com.practise.LeetCode;

public class IpAddress {

    public String defangIPAdrress(String ipAddress){


        StringBuilder sb = new StringBuilder();

        for(char c : ipAddress.toCharArray()){

            sb.append( c == '.' ? "[.]":c);
        }


        return String.valueOf(sb);


    }
}

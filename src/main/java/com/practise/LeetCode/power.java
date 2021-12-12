package com.practise.LeetCode;

public class power {
    public static void main(String[] args) {

        Integer base = 5;
        Integer exponent = base;

         Integer value = powerCall(base,exponent);
        System.out.println(value);
    }

    private static Integer powerCall(Integer base, Integer exponent) {
        System.out.println("base"+base);
        System.out.println("exponent"+exponent);

        Integer value = 1;
        for(int i =0; i <exponent;i++){

            value = value*exponent;
            System.out.println("temp:"+value);
        }
        return value;
    }
}

package com.practise.LeetCode;

public class MaxInteger {

       String maxValue(String n, int x) {

        boolean isNegetive = false;
        if (n.charAt(0) == '-') {
            System.out.println("the number is negitive");
            isNegetive = true;

        } else {
            System.out.println("the number is positive");
        }

        for (int i = 0; i < n.length(); i++) {
            int current = n.charAt(i) - '0';

            //true && -3 > 5
            if (!isNegetive && current < x || isNegetive && current > x) {

                return (isNegetive ? "-" : "" + n.substring(0, i) + x + n.substring(i));

            }
            return (isNegetive ? "-" : "" + n + x);


        }


        return "0";
    }
}

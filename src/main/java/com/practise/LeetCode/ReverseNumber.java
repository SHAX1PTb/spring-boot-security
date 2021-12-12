package com.practise.LeetCode;

public class ReverseNumber {

    public int reverseNum(int x){

        int result = 0;
        int sign = x;

     if(Integer.signum(x) == -1){
         System.out.println("negetive");
     } else {
         System.out.println("positive");
     }

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        //result = Integer.signum(sign) == 1 ? result: result*-1;

        return result;
    }
}

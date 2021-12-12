package com.practise.LeetCode;

public class prime {
    public static void main(String[] args) {

        Integer a = 200;

        Integer sum =0;

        for(int number =1;number<=8;number++){
            Integer count =0;
           // for(int j =2;j<number/2;j++){

            //    System.out.println("j:"+j  );

                if(number%2 ==0){
                 count++;
                }

                if(count ==0 && number != 1){
                    System.out.println(number);
                    sum = sum+ number;

                }
         //   }


        }

        System.out.println(sum);
    }
}

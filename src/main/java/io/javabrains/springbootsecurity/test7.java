package io.javabrains.springbootsecurity;

public class test7 {
    public static void main(String[] args) {

        int abc = 123;

        int hundred=0;
        int tens =0;
        int ones=0;


        hundred =Math.abs((abc/100)% 100);
        tens = (abc /10) %10;
        ones = (abc/1) % 10;

        System.out.println("10's"+tens);
        System.out.println("100's"+hundred);
        System.out.println("1's"+ones);

        while(abc != 0){
            int zz = abc % 10;
            System.out.println(zz);
           abc = abc/10;
        }
       // System.out.println(abc%10);

    }
}

package io.javabrains.springbootsecurity;

import java.util.Arrays;

public class test5 {

    public static void main(String[] args) {

        int[] input = new int[]{1,2,3,4,5,};
        int[] output1 = new int[5];
        int k= 3;

        int[] output = new int[3];

        System.arraycopy(input,0,output,0,k);


        System.arraycopy(input,k,output1,0,input.length-k);
        System.arraycopy(output,0,output1,k+1,(input.length)-k);
        System.out.println(Arrays.toString(output1));




    }
}

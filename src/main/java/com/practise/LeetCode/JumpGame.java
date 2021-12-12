package com.practise.LeetCode;

public class JumpGame {

    public static void main(String[] args) {
        int[] a = {2};

        int start = a[1];
        start++;
        int size = a.length-1;
     //   System.out.println(start);
        System.out.println(a[start]);
        System.out.println(size);
        if(a[start] == size){
            System.out.println("end");
        } else{
            System.out.println("not end of array");
        }
//        System.out.println(size);
    }
}

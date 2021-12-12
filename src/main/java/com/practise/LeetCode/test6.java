package com.practise.LeetCode;

import java.util.HashMap;
import java.util.List;

public class test6 {
    public static void main(String[] args) {


        int arr[] = {0, 1, 1, 2, 3, 1, 3, 6, 6,  11};

        HashMap<Integer,Integer> abc = new HashMap<Integer,Integer>();
        int j =0;

        for (int i = 0; i < arr.length; i++) {

            if(!abc.containsKey(arr[i])){

               // System.out.println(j);

                abc.put(j,arr[i]);
                j++;
            }else{
               // System.out.println("duplicate:"+arr[i]);
            }



        }

        System.out.println(abc);

    }


}


package com.practise.LeetCode;

import java.util.*;

public class tree {

    public static void main(String[] args) {

        Integer[] nums = {2,4,1,6,3,7,9,5,5};

        SortedSet<Integer> treeSet = new TreeSet(Arrays.asList(nums));

     //   System.out.println(treeSet);

        for(int a:treeSet){
            System.out.println(a);
        }

        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(2,"Shankar");
        hashMap.put(1,"Nagaratna");
        hashMap.put(3,"pranavi");
        hashMap.put(4,"Dhruv");

        System.out.println(hashMap);



    }
}

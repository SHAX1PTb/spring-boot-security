package com.practise.LeetCode;

import java.util.*;

public class TopFrequentElements {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
        int n = arr.length;
        int k = 2;

        print_N_mostFrequentNumber(arr, n, k);


    }

    private static void print_N_mostFrequentNumber(int[] arr, int n, int k) {

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i =0;i<arr.length;i++){

            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        System.out.println(mp);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());



        System.out.println(list.get(0));
//        List<Map<Integer,Integer>> list2 = new ArrayList<>();
//        list2.addAll(Collections.singleton(mp));
//        System.out.println("list2:"+list2);

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

                if(o1.getValue() == o2.getValue()) {
                    return  o2.getKey() - o1.getKey();
                } else{
                    return o2.getValue() - o1.getValue();
                }

            }
        });

        System.out.println(list);

    }
}

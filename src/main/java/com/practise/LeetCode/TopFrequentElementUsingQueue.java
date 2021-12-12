package com.practise.LeetCode;


import java.util.HashMap;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopFrequentElementUsingQueue {

     public  int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>((n1,n2)->count.get(n1)- count.get(n2));

        for(int n:count.keySet()){

            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

         int[] top = new int[k];
         for(int i = k - 1; i >= 0; --i) {
             top[i] = heap.poll();
         }
         return top;
    }
}

package com.practise.LeetCode;

import java.util.*;

public class heap {
    public static void main(String[] args) {



        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> heapWithValues = new PriorityQueue<>(Arrays.asList(3,1,2));

        minheap.add(5);
        maxheap.add(5);

        minheap.poll();


        System.out.println(maxheap.peek());
        System.out.println(minheap.peek());
        System.out.println(minheap.size());

    }
}

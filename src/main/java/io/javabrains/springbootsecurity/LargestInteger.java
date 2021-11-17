package io.javabrains.springbootsecurity;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestInteger {

    static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(2,(n1, n2) -> n1 - n2);

        for (int n : nums) {

            heap.offer(n);

         //   heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

       // return heap.poll();
        return heap.peek();


    }
}

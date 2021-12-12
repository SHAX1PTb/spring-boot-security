package com.practise.LeetCode;

import org.junit.Test;

public class TopFrequentElementUsingQueueTest {

    @Test
    public void topFrequency(){

        TopFrequentElementUsingQueue topFrequentElementUsingQueue = new TopFrequentElementUsingQueue();

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        topFrequentElementUsingQueue.topKFrequent(nums,k);

    }

}
package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class LargestIntegerTest  {

    @Test
    public void maxLargestInt(){

        LargestInteger largestInteger = new LargestInteger();

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        int ret = largestInteger.findKthLargest(nums,k);
        Assert.assertEquals(5,ret);


    }

}
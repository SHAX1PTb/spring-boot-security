package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSwapTest  {

    @Test
    public void TestMinSwapTest(){

        MinimumSwap minimumSwap = new MinimumSwap();

        int a = minimumSwap.minimumSwaps(new int[]{1,2,3,5,4});
        Assert.assertEquals(1,a);
    }

}
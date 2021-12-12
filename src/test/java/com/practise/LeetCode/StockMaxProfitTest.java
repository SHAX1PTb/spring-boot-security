package com.practise.LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class StockMaxProfitTest  {

    @Test
    public void maxProfitTest(){

        StockMaxProfit stockMaxProfit = new StockMaxProfit();

        int[] a = {7,1,5,3,6,4};
        Assert.assertEquals(5,stockMaxProfit.maxProfit(a));
    }

}
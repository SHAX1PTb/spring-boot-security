package com.practise.LeetCode;

import org.junit.Test;

public class TwoSumTest  {

    @Test
    public void twosumtest(){

        int[] a = new int[]{2,7,11,15};
        int target = 9;

        TwoSum twoSum = new TwoSum();

        System.out.println(twoSum.twosum(a,target));
    }

}
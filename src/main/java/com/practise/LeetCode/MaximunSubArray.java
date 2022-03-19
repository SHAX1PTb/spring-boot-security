/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;

public class MaximunSubArray {

    public Integer maxSubArray(int[] nums) {

        Integer maxSubArray = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            Integer currentSubArray = 0;

            for (int j = i; j < nums.length; j++) {

                currentSubArray = currentSubArray + nums[j];

                maxSubArray = Math.max(maxSubArray, currentSubArray);

            }

        }

        return maxSubArray;


    }

}

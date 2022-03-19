/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;

public class FirstMissingPositiveInteger {

    public Integer missingPositive(int[] nums) {

        int n = nums.length;
        int cointains = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cointains++;
                break;
            }

        }

        if (cointains == 0) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] <=0  || nums[i] > n) {
                nums[i] = 1;
            }

        }

        for (int i = 0; i < n; i++) {

            int x = Math.abs(nums[i]);
            if (nums[x ] > 0) {
                nums[x ] = nums[x ] * -1;
            }
        }

        for(int i = 1 ; i < n ; i++){
            if (nums[i] > 0){
//                return i+1;
                return i;
            }
        }

        if(nums[0] > 0){
            return n;
        }
        return n+1;
    }
}

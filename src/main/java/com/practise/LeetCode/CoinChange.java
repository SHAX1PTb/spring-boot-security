package com.practise.LeetCode;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {2,7,11,15};
        int amount = 9;

        int[] a =twoSum(coins,amount);
        System.out.println(Arrays.toString(a));


    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i =0;i<nums.length;i++){

            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }

            }
        }

        return null;
    }
}

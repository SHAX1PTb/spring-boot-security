package com.practise.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twosum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //Curr+x = target
            //x=target-curr
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);

        }

        return null;
    }
}

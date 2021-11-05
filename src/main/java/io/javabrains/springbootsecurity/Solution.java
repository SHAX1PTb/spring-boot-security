package io.javabrains.springbootsecurity;

import java.util.*;

public class Solution {
    private static int[] nums = {1, 2, 3};
    private static int[] nums1 = {1, 2, 3};


    public static void main(String[] args) {

        Solution solution = new Solution(nums);
    }


    public int[] reset() {

        return new int[]{1, 2, 3};
    }

    ;

    public int[] suffle() {

        List<Integer> list = new ArrayList<>();

        for (int i : nums) {
            list.add(i);
        }

        Collections.shuffle(list);

        for (int a = 0; a < list.size(); a++) {

            nums1[a] = list.get(a);
        }

        //
        System.out.println("before Swap:" + list);
        Collections.swap(list, 1, 2);
        System.out.println("After Swap:" + list);

        return nums1;
    }

    ;

    public Solution(int[] nums) {
        reset();
        System.out.println(Arrays.toString(reset()));
        suffle();
        System.out.println(Arrays.toString(suffle()));


    }
}

package io.javabrains.springbootsecurity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class triplets {

    public static void main(String[] args) {
        int[] nums = { 12, 3, 6, 1, 6, 9 };
        int sum = 24;

        List<List<Integer>> triplets = findtriplets(nums,sum);

        // Function call
        if (!triplets.isEmpty()) {
            System.out.println(triplets);
        }
        else {
            System.out.println("No triplets can be formed");
        }

    }

    private static List<List<Integer>> findtriplets(int[] nums, int sum) {
        Arrays.sort(nums);
        List<List<Integer> > pair   = new ArrayList<>();

        TreeSet<String> set = new TreeSet<>();

        List<Integer> triplets = new ArrayList<>();
        System.out.println(Arrays.toString(nums));

        for (int i = 0;             i < nums.length - 2;             i++) {

            System.out.print(nums[i]);
            int j = i + 1;
            int k = nums.length - 1;
            while(j<k){

                if(nums[i]+nums[j]+nums[k] ==sum){
                    String str = nums[i]+":"+nums[j]+":"+nums[k];

                    if(!set.contains(str)){

                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        pair.add(triplets);
                        triplets = new ArrayList<>();
                        set.add(str);


                    }
                    j++;
                    k--;

                }else if (nums[i]+nums[j]+nums[k] < sum) {
                    j++;
                }else{
                    k--;
                }
            }
        }

return pair;
    }
}

package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxLengthOfString {

    public int maxLength(List<String> arr) {

        List<String> result = new ArrayList<>();
        result.add("");
        int best = 0;

        for (String word : arr) {
            int resultsize = result.size();

            for (int i = 0; i < resultsize; i++) {

                String newRes = result.get(i) + word;
                Set<Character> newResSet = new HashSet<>();
                for (char c : newRes.toCharArray()) {
                    newResSet.add(c);
                }

                if (newRes.length() != newResSet.size()) {
                    continue;
                }

                result.add(newRes);
                best = Math.max(best, newRes.length());


            }


        }
        return best;
    }
}

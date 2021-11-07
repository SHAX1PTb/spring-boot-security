package io.javabrains.springbootsecurity;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepetativeSubString {
    public static void main(String[] args) {

        String s = "abcabcbb";

        int b = lengthOfLongestSubstring(s);
        System.out.println(b);

    }

    private static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int res = 0;

        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();

        int max = 0;

        for (int i = 0, j = 0; i < n; i++) {
            //   String s = "abcabcbb";

            System.out.println(s.charAt(i));

            if (map.containsKey(s.charAt(i))) {

                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);

        }


        return max;
    }
}

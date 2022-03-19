/*
 * Copyright (c) 2022.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagram(String[] strs) {

        if (strs.length == 0) return new ArrayList<>();
        Map<String, List> ans = new HashMap<String, List>();

        for (String s : strs) {

            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            if (!ans.containsKey(key)) {

                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);

        }
        return new ArrayList(ans.values());
    }
}

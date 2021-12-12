package com.practise.LeetCode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class RemoveDuplicatesInString {

  public int alternatingCharacters(String s) {

    char[] a = s.toCharArray();
    LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();

    for (int i = 0; i <= a.length - 1; i++) {

      hashMap.put(String.valueOf(a[i]), hashMap.getOrDefault(String.valueOf(a[i]), 0) + 1);
    }
    int count = 0;

    Set<String> ss = hashMap.keySet();

    Iterator ee = ss.iterator();

    while (ee.hasNext()) {

        Integer tt = hashMap.get(ee.next());
      if (tt > 1) {
          count = count+tt-1;

      } else {
        continue;
      }
    }

  //   System.out.println(count);
    return count;
  }
}

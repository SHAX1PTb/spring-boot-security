package com.practise.LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxToys {

  public int maximumToys(List<Integer> prices, int k) {

    int max_toys = 0;
//    Arrays.sort(prices);
      Collections.sort(prices);
    if (prices.size() == 0 || k == 0) return max_toys;

    for (int i = 0; i < prices.size(); i++) {

      k -= prices.get(i);
      if (k < 0) return max_toys;
      max_toys++;
    }
    return max_toys;
  }
}

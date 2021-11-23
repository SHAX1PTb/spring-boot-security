package io.javabrains.springbootsecurity;

import java.util.ArrayList;
import java.util.List;

public class FirstLastElementsSortedArray {

  public int[] searchRange(int[] nums, int target) {

    int[] ret = new int[2];
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] == target) {
        list.add(i);
      }
    }

    ret[0] = list.get(0);
    ret[1] = list.get(ret.length - 1);

    return ret;
  }
}

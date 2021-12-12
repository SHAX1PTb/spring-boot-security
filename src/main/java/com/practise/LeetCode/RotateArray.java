package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {

  public List<Integer> rotLeft(List<Integer> a, int d) {

    List<Integer> ret = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    for (int i = 0; i < d; i++) {
      temp.add(a.get(i));
    }

    for (int i = d; i < a.size(); i++) {

      ret.add(a.get(i));
    }

    ret.addAll(temp);
    return ret;
  }
}

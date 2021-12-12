package com.practise.LeetCode;

public class Sqrt {

  public int mySqrt(int x) {
    if (x < 2) return x;

    long num;
    int left = 2;
    int right = x / 2;
    int pivot;

    while (left <= right) {

      pivot = left + (right - left) / 2;
      num = pivot * pivot;

      if (num > pivot) right = pivot - 1;
      else if (num < pivot) right = pivot + 1;
      else return pivot;
    }
    return right;
  }
}

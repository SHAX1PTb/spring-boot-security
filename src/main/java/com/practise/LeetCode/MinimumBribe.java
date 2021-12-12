package com.practise.LeetCode;

public class MinimumBribe {

  public static void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }

  public void minimumBribes(int[] arr) {

    int swapCount = 0;

    for (int i = arr.length - 1; i >= 0; i--) {

      if (arr[i] != i + 1) {

        if ((i - 1) >= 0 && arr[i - 1] == i + 1) {
          swapCount++;
          swap(arr, i, i - 1);
        } else if ((i - 2) >= 0 && arr[i - 2] == i + 1) {
          swapCount += 2;
          swap(arr, i - 2, i - 1);
          swap(arr, i - 1, i);
        } else {
          System.out.println("Too Chaotic");
          return;
        }
      }
    }
  }
}

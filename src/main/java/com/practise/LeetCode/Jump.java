package com.practise.LeetCode;

public class Jump {

  public int jump(int[] nums) {

    int jumps = 0;
    int currentJumpEnd = 0;
    int fartherJumpEnd = 0;

    for (int i = 0; i < nums.length - 1; i++) {

      fartherJumpEnd = Math.max(fartherJumpEnd, i + nums[i]);

      if (i == currentJumpEnd) {
        jumps++;
        currentJumpEnd = fartherJumpEnd;
      }
    }

    return jumps;
  }
}

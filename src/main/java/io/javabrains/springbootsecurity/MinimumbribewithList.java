package io.javabrains.springbootsecurity;

import java.util.List;

import static java.util.Collections.swap;

public class MinimumbribewithList {

  public void minbribWithList(List<Integer> q) {

    int swapcount = 0;
    for (int i = q.size() - 1; i >= 0; i--) {

      if (q.get(i) != i + 1) {

        if (q.get(i) == i - 1) {
          swapcount++;
          swap(q, i, i - 1);
        } else if (q.get(i) == i - 2) {
          swapcount += 2;
          swap(q, i - 1, i - 2);
          swap(q, i - 2, i);
        } else {
          System.out.println("Too chaotic");
          return;
        }
      }
      System.out.println(swapcount);
    }
  }
}

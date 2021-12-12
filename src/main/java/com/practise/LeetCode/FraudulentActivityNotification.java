package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FraudulentActivityNotification {

  public int activityNotifications(List<Integer> expenditure, int d) {

    int alert = 0;
    for (int j = d; j < expenditure.size() - 1; j++) {
      List<Integer> temp =  new ArrayList<>();;

      for (int i = 0; i < d; i++) {


        temp.add(expenditure.get(i));
      }
      int median = 0;
      if (temp.size() % 2 == 0) {

        median = (temp.get(d / 2) + temp.get(d / 2 - 1)) / 2;
      } else {

        median = temp.get(d / 2);
      }

      if (median > 2 * expenditure.get(d + 1)) {
        alert = alert + 1;
      }
    }
    return alert;
  }
}

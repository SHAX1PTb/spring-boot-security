package com.practise.LeetCode;

import java.util.HashMap;
import java.util.Iterator;

public class Test20 {

  // given 2 strings if they are anagrams
  public boolean checkAnagram(String one, String two) {

    char[] oneChar = one.toCharArray();
    char[] twoChar = two.toCharArray();

    HashMap<Character, Integer> oneCharTempHasmap = new HashMap<>();




    for (int i = 0; i <= oneChar.length - 1; i++) {

      oneCharTempHasmap.put(
          Character.toUpperCase(oneChar[i]),
              oneCharTempHasmap.getOrDefault(Character.toUpperCase(oneChar[i]) , 0)+1);
    }

    for (int i = 0; i < twoChar.length; i++) {

      if (oneCharTempHasmap.containsKey(Character.toUpperCase(twoChar[i]))) {

        oneCharTempHasmap.put(Character.toUpperCase(twoChar[i]),oneCharTempHasmap.get(Character.toUpperCase(twoChar[i])) -1);
      } else {
        return false;
      }

    }


    boolean anagramFlag = true;


    Iterator ee = oneCharTempHasmap.keySet().iterator();


    while(ee.hasNext()){

      Integer val = (Integer) oneCharTempHasmap.get(ee.next());

      if ( val != 0) {
        anagramFlag = false;
        break;
      }

    }


    return anagramFlag;
  }
}


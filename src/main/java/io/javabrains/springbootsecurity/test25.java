package io.javabrains.springbootsecurity;

public class test25 {

  //    Given the head of a linked list, remove the nth node from the end of the list and return its
  // head.
  //    Example 1:
  //    Input: head = [1,2,3,4,5], n = 2
  //    Output: [1,2,3,5]
  //    Example 2:
  //    Input: head = [1], n = 1
  //    Output: []
  //    Example 3:
  //    Input: head = [1,2], n = 1
  //    Output: [1]

  // String = Chars of array
  // Begin  end
  // swap these 2 char

  public String revString(String toRev) {

    char[] chars = toRev.toCharArray();

    Integer start = 0;
    Integer end = toRev.length();

    for (int i = 0; i < toRev.length(); i++) {

      swapTemp(start, end, chars);
      start++;
      end--;
    }
    return null;
  }

  private void swapTemp(Integer start, Integer end, char[] charss) {

    char temp = 0;
    charss[start] = temp;
    charss[start] = charss[end];
    charss[end] = temp;
  }
}

package com.practise.LeetCode;

import java.util.*;

public class PalindromeLinkedList {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        boolean compare = compare(list);
        System.out.println(compare);
    }


    public static boolean compare(List<Integer> list) {

        List<Integer> list2 = new ArrayList<>();
        Stack<Integer> stack = new Stack();


        for (int i = 0; i < list.size(); i++) {

            stack.add(list.get(i));

        }

        while (stack.size() > 0) {

            list2.add(stack.pop());
        }

        return list.equals(list2);


    }


}

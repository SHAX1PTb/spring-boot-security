package com.practise.LeetCode;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_validation {

    public static void main(String[] args) {

        LinkedList<Integer> ll
                = new LinkedList<Integer>();

        ll.add(4);
        ll.add(5);
        ll.add(1);
        ll.add(9);

        ll.remove(2);


        ll.push(10);
        ll.pop();
        System.out.println(ll);

        Iterator ee = ll.listIterator();

        while (ee.hasNext()){
            System.out.println(ee.next());
        }

        Iterator ef = ll.descendingIterator();
        while (ef.hasNext()){
            System.out.println(ef);
        }
    }
}

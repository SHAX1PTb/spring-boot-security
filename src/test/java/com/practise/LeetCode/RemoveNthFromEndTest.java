package com.practise.LeetCode;

import org.junit.Test;
import util.DoubleLinkedList;

public class RemoveNthFromEndTest {

    @Test
    public void removeNthElement(){

        DoubleLinkedList.ListNode a = new DoubleLinkedList.ListNode();
        a.addNode(1);
        a.addNode(2);
        a.addNode(3);
        a.addNode(4);
        a.addNode(5);

//        RemoveNthFromEnd b = new RemoveNthFromEnd();
//        b.removeNthFromEnd(a,2);

        a.display();

    }

}
/*
 * Copyright (c) 2021.
 * Shankargouda Annigeri
 *
 *
 */

package util;

import org.junit.jupiter.api.Test;

class LinkedListTest {
    @Test
    void name() {
        System.out.println("hello");
    }

    @Test
    public void testLinkedList() {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insertAtStart(1);
        linkedList.insertAt(2,55);
        linkedList.insertAt(0,100);
        linkedList.deleteAt(2);
        linkedList.show();
    }

}
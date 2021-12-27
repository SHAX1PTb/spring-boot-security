/*
 * Copyright (c) 2021.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.LeetCode;


import util.Node;

// * Definition for singly-linked list.
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }

    void insert(int val) {
        Node node = new Node();
        node.data = val;
        node.next = null;


    }
}

public class Walmart {
    public static void main(String[] args) {
        ListNode1 ll = new ListNode1();
        ll.val = 1;
        ll.val = 2;


    }

    public ListNode1 removeNthFromEnd(ListNode1 head, Integer n) {
        ListNode1 dummy_head = new ListNode1(0);
        dummy_head.next = head;

        ListNode1 slow = dummy_head;
        ListNode1 fast = dummy_head;
        for (int i = 1; i < n + 1; i++) {

            fast = fast.next;
        }

        while (fast != null) {

            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy_head.next;
    }


}

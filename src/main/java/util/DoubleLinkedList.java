/*
 * Copyright (c) 2021.
 * Shankargouda Annigeri
 *
 *
 */

package util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DoubleLinkedList {

    public final Log log = LogFactory.getLog(DoubleLinkedList.class);

    public static class ListNode {
        public final Log log = LogFactory.getLog(ListNode.class);
        public ListNode head = null;
        public ListNode tail = null;
        int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        /***
         *
         * @param data
         */
        public void addNode(int data) {
            ListNode newNode = new ListNode(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        public void display(){
            ListNode current = head;
            if(head == null){
                log.info("List is empty !");
                return;
            }

            log.info("Number of Singly linked List: ");
            while (current != null){
                log.info(current.val+" ");
                current = current.next;
            }
        }
    }


    public ListNode mergeTwoList(ListNode a, ListNode b) {

        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else if (a.val < b.val) {
            a.next = mergeTwoList(a.next, b);
            return a;

        } else if (a.val > b.val) {
            b.next = mergeTwoList(a, b.next);
            return b;
        }

        return null;
    }


}

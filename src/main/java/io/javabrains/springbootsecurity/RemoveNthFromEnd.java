package io.javabrains.springbootsecurity;


import util.Node.ListNode;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;

        while (first != null) {

            first = first.next;
        }

        return dummy.next;
    }


}

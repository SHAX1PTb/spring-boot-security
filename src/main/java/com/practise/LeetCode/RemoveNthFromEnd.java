package com.practise.LeetCode;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import util.Node.ListNode;

public class RemoveNthFromEnd {
    private final Log log = LogFactory.getLog(RemoveNthFromEnd.class);

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;

        while (first != null) {
            length++;
            first = first.next;
        }

        log.info("length:" + length);

        return dummy.next;
    }


}

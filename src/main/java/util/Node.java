package util;

public class Node {


    public static class ListNode {
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

        public void addNode(int data) {
            ListNode newNode = new ListNode(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
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

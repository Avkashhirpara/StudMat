package com.studmat.progs.linkedlist;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode dummy = new ListNode();
        dummy.next = head;

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }

        if (l1 != null) {
            head.next = l1;
        }
        if (l2 != null) {
            head.next = l2;
        }
        return dummy.next.next;
    }

    public static void main(String[] args) {
        ListNode l1 = null;//new ListNode(5);
        // l1.next = new ListNode(2);
        //l1.next.next = new ListNode(4);
        //l1.next.next.next = new ListNode(9);

        ListNode l2 = null;//new ListNode(1);
        //l2.next = new ListNode(3);
        // l2.next.next = new ListNode(4);
//        l2.next.next.next = new ListNode(4);
//        l2.next.next.next.next = new ListNode(5);
        l1 = new MergeTwoLists().mergeTwoLists(l1, l2);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}

package com.studmat.progs.linkedlist;

class ListNode1 {
    int val;
    ListNode next;
    ListNode1(int x) {
        val = x;
    }
}

public class DeleteNode {
    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
            } else {
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(4);
//        head.next = new ListNode(5);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(9);

        ListNode head = new ListNode(-3);
        head.next = new ListNode(5);
        head.next.next = new ListNode(-99);



        new DeleteNode().deleteNode(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }



    }
}


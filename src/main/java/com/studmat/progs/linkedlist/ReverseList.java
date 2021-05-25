package com.studmat.progs.linkedlist;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
      ListNode temp =null;
        ListNode prev= null;
        while (head != null){
            temp = head.next;
            head.next = prev;
            prev= head;
            head = temp;
        }
        return prev;
    }

    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);  //subproblem
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
//        ListNode head = new ListNode(4);
//        head.next = new ListNode(5);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(9);

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        head = new ReverseList().reverse(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }



    }
}

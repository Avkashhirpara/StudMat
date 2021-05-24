package com.studmat.progs.linkedlist;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthFromEnd {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        ListNode temp = head;
        int i = 0;
        while (head.next != null) {
            head = head.next;
            if(i >= n){
                temp = temp.next;
            }
            i++;
        }
        if(temp == head){
           return null;
        }else if(i < n) {
           return temp.next;
        }else{
            temp.next = temp.next.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head = new RemoveNthFromEnd().RemoveNthFromEnd(head,1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

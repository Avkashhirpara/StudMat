package com.studmat.progs.linkedlist;

public class PalindromeLinkList {
    public boolean isPalindrome(ListNode head) {

        ListNode root = head;
        boolean isPalindrome = true;
        StringBuilder sb = new StringBuilder("");

        while (root != null) {
            sb.append(root.val);
            root = root.next;
        }
        String original = sb.toString();
        String reversed = sb.reverse().toString();
        isPalindrome = reversed.equals(original);

        return isPalindrome;
    }

    public static void main(String[] args) {
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(3);
        l2.next.next.next.next = new ListNode(1);
        System.out.println(new PalindromeLinkList().isPalindrome(l2));
    }
// best solution.
//    ListNode slow = head;
//    ListNode fast = head;
//    ListNode pre  = null;
//    ListNode prepre  = null;
//
//        while (fast != null && fast.next != null) {
//        pre = slow;
//        slow = slow.next;
//        fast = fast.next.next;
//        pre.next = prepre;
//        prepre = pre;
//    }
//
//        if (fast != null) {
//        slow = slow.next;
//    }
//
//        while (pre != null && slow != null) {
//        if (pre.val != slow.val) {
//            return false;
//        }
//        pre = pre.next;
//        slow = slow.next;
//    }
//        return true;
//}
}

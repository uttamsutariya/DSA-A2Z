package _6_linked_list.medium_problems_sll;

import java.util.*;

public class CheckPalindromeLL {

    static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        /**
         * using stack
         */

//        Stack<Integer> st = new Stack<>();
//
//        ListNode temp = head;
//
//        // push all nodes to stack
//        while(temp != null) {
//            st.push(temp.val);
//            temp = temp.next;
//        }
//
//        // pop from stack and compare
//        temp = head;
//
//        while(temp != null) {
//            if(st.pop() != temp.val) return false;
//            temp = temp.next;
//        }
//
//        return true;

        /**
         * find middle
         * reverse from middle till end & compare
         */

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // slow is at mid => reverse ll from slow.next
        ListNode rev =  reverseLL(slow.next);
        ListNode start = head;

        while (rev != null && start != null) {
            if(rev.val != start.val) return false;
            rev = rev.next;
            start = start.next;
        }

        return true;
    }

    private ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }
}

// https://takeuforward.org/data-structure/check-if-given-linked-list-is-plaindrome/
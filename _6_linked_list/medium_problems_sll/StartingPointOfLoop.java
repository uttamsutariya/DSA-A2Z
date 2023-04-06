package _6_linked_list.medium_problems_sll;

import java.util.*;

public class StartingPointOfLoop {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
//        int index = 0;
//        ListNode curr = head;
//
//        if(head == null) return null;
//
//        Map<ListNode, Integer> hm = new HashMap<>();    // <node, index>
//
//        while (curr != null) {
//            if(hm.containsKey(curr)) return curr;
//            else {
//                hm.put(curr, index++);
//                curr = curr.next;
//            }
//        }
//
//        return null;

        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                while (slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }

                return slow;
            }
        }

        return null;
    }
}

// https://leetcode.com/problems/linked-list-cycle-ii/
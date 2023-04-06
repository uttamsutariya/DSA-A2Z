package _6_linked_list.medium_problems_sll;

import java.util.*;

public class DetectCycleInLL {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public boolean hasCycle(ListNode head) {
//        Map<ListNode, Boolean> hm = new HashMap<>();
//
//        ListNode curr = head;
//
//        while(curr != null) {
//            if(hm.containsKey(curr)) return true;
//            else {
//                hm.put(curr , true);
//                curr = curr.next;
//            }
//        }
//
//        return false;

        if(head == null) return false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }

        return false;
    }
}


// https://leetcode.com/problems/linked-list-cycle
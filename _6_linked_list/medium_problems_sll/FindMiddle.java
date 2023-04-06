package _6_linked_list.medium_problems_sll;



public class FindMiddle {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            if(fast.next != null)
                fast = fast.next.next;
            else
                fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}

// https://leetcode.com/problems/middle-of-the-linked-list/description/

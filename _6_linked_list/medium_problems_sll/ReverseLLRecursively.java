package _6_linked_list.medium_problems_sll;

public class ReverseLLRecursively {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        return reverse(head, curr, prev);
    }

    private ListNode reverse(ListNode head, ListNode curr, ListNode prev) {
        if(curr == null) {
            head = prev;
            return head;
        }

        ListNode forward = curr.next;

        curr.next = prev;

        return reverse(head, forward, curr);

    }
}

// https://leetcode.com/problems/reverse-linked-list/description/

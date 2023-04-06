package _6_linked_list.singly_ll;

public class ReverseLL {
    //Function to reverse a linked list.
    public static Node reverseList(Node head)
    {
        if(head == null || head.next == null) return head;

        Node curr = head;
        Node prev = null;
        Node forward = null;

        while(curr != null) {
            forward = curr.next;
            prev = curr;
            curr = forward;
        }

        return prev;
    }
}

// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
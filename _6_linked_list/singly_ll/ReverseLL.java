package _6_linked_list.singly_ll;

public class ReverseLL {
    //Function to reverse a linked list.
    public static Node reverseList(Node head)
    {
        Node temp = head;
        Node prev = null;

        while(temp.next != null) {
            Node x = temp.next;
            temp.next = prev;
            prev = temp;
            temp = x;
        }

        temp.next = prev;

        return temp;
    }
}

// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
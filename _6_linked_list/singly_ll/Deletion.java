package _6_linked_list.singly_ll;

public class Deletion {
    public Node deleteNode(Node head, int pos)
    {
        if(head == null) return null;

        if(pos == 1) return head.next;

        Node temp = head;

        for(int i = 0 ; i<pos-2 ; i++) temp = temp.next;

        temp.next = temp.next.next;

        return head;
    }
}

// https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-a-node-in-single-linked-list

package _6_linked_list.doubly_ll;

public class Deletion {
    // function returns the head of the linkedlist
    public Node deleteNode(Node head,int pos)
    {
        if(head == null) return head;

        if(pos == 1) {
            Node headNext = head.next;
            headNext.prev = null;
            return headNext;
        }

        Node temp = head;

        for(int i = 0 ; i<pos-2 ; i++) temp = temp.next;

        Node temp2 = temp.next;
        temp.next = temp2.next;
        if(temp2.next != null) {
            temp2.prev = temp;
        }

        return head;
    }
}

// https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-node-in-doubly-linked-list
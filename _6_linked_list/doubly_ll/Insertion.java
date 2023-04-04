package _6_linked_list.doubly_ll;

public class Insertion {
    //Function to insert a new node at given position in doubly linked list.
    public void addNode(Node head, int pos, int data)
    {
        Node add = new Node(data);

        if(head == null) head = add;

        Node temp = head;

        for(int i = 0; i<pos ; i++) temp = temp.next;

        add.next = temp.next;
        add.prev = temp;
        temp.next = add;
    }
}

// https://practice.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insert-a-node-in-doubly-linked-list
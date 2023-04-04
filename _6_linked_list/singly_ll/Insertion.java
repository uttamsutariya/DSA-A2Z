package _6_linked_list.singly_ll;

public class Insertion {
    //Function to insert a node at the beginning of the linked list.
    public Node insertAtBeginning(Node head, int x)
    {
        Node add = new Node(x);

        if(head == null) return add;

        add.next = head;
        return add;
    }

    //Function to insert a node at the end of the linked list.
    public Node insertAtEnd(Node head, int x)
    {
        Node add = new Node(x);

        if(head == null) {
            return add;
        }

        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = add;

        return head;
    }
}

// https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
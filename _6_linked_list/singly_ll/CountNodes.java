package _6_linked_list.singly_ll;

public class CountNodes {
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        if(head == null) return 0;

        int count = 0;

        while(head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}

// https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list
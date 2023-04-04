package _6_linked_list.doubly_ll;

public class ReverseLL {
    public static Node reverseDLL(Node  head)
    {
        Node temp = head;
        Node prev = null;

        while(temp.next != null) {
            Node x = temp.next;
            temp.next = prev;
            temp.prev = x;
            prev = temp;
            temp = x;
        }

        temp.next = prev;
        temp.prev = null;

        return temp;
    }
}

// https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-a-doubly-linked-list
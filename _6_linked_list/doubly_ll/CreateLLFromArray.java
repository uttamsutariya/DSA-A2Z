package _6_linked_list.doubly_ll;

public class CreateLLFromArray {
    public Node constructDLL(int arr[]) {

        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1 ; i<arr.length ; i++) {

            Node add = new Node(arr[i]);
            temp.next = add;
            add.prev = temp;
            temp = add;

        }

        return head;

    }
}

// https://practice.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-doubly-linked-list

package _6_linked_list.singly_ll;

public class CreateLLFromArray {
    public static Node constructLL(int arr[]) {

        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1 ; i<arr.length ; i++) {

            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;

        }

        temp.next = null;

        return head;
    }
}

// https://practice.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
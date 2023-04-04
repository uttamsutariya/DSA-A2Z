package _6_linked_list.singly_ll;

public class Search {
    static boolean searchKey(int n, Node head, int key) {

        while(head != null) {
            if(head.data == key) return true;
            head = head.next;
        }

        return false;
    }
}

// https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326

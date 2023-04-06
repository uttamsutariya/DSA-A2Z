package _6_linked_list.medium_problems_sll;

public class FindLengthOfLoop {
    static class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    //Function to find the length of a loop in the linked list.
    public static int findLengthOfLoop(Node head) {
        // detect cycle
        // find starting point of loop
        // track counter

        if(head == null) return 0;

        Node slow = head;
        Node fast = head;
        Node entry = head;
        Node sol = null;    // starting of loop

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                while (slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                sol = slow;
                break;
            }
        }

        int length = 0;
        Node temp = sol;
        while (sol.next != temp) {
            length++;
            sol = sol.next;
        }

        return length;
    }
}

// https://practice.geeksforgeeks.org/problems/find-length-of-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-length-of-loop
package _6_linked_list.doubly_ll;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

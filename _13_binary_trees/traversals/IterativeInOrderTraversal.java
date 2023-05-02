package _13_binary_trees.traversals;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class IterativeInOrderTraversal {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println(inOrderTraversal(root));
    }

    private static ArrayList<Integer> inOrderTraversal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Node> st = new ArrayDeque<>();

        Node curr = root;

        while (true) {

            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            else {
                if(st.isEmpty()) break;
                curr = st.pop();
                ans.add(curr.data);
                curr = curr.right;
            }
        }

        return ans;
    }
}

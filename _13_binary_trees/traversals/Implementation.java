package _13_binary_trees.traversals;

import java.util.*;

public class Implementation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter root node data");
        int data = sc.nextInt();
        TreeNode root = new TreeNode(data);

        buildTree(root);

        System.out.println();
        System.out.println("InOrder Traversal");
        inOrderTraversal(root);

        System.out.println();
        System.out.println("PreOrder Traversal");
        preOrderTraversal(root);

        System.out.println();
        System.out.println("PostOrder Traversal");
        postOrderTraversal(root);

        System.out.println();
        System.out.println("LevelOrder Traversal");
        levelOrderTraversal(root);

        // 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 -1
    }

    public static void inOrderTraversal(TreeNode root) {
        if(root == null) return;

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(TreeNode root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root) {
        if(root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrderTraversal(TreeNode root) {

        if(root == null) return;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node == null && !q.isEmpty()) {
                System.out.println();
                q.offer(null);
            }
            else if(node != null) {
                System.out.print(node.data + " ");

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
    }

    public static void buildTree(TreeNode root) {
        System.out.println("Enter left node data of " + root.data);
        int leftData = sc.nextInt();

        if(leftData != -1){
            root.left = new TreeNode(leftData);
            buildTree(root.left);
        }

        System.out.println("Enter right node data of " + root.data);
        int rightData = sc.nextInt();

        if(rightData != -1) {
            root.right = new TreeNode(rightData);
            buildTree(root.right);
        }
    }
}

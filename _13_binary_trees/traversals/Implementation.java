package _13_binary_trees.traversals;

import java.util.Scanner;

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

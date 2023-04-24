package _13_binary_trees.medium;

import _11_heaps.medium.IsBinaryTreeHeap;
import com.sun.source.tree.Tree;

public class CheckCompleteness {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isCompleteTree(TreeNode root) {
        int currIndex = 0;
        int totalCount = findTotalNodesCount(root);
        return check(root, currIndex, totalCount);
    }

    private boolean check(TreeNode root, int index, int totalCount) {
        if(root == null) {
            return true;
        }

        if(index >= totalCount) return false;

        else {
            boolean left = check(root.left, 2*index+1, totalCount);
            boolean right = check(root.right, 2*index+2, totalCount);
            return left && right;
        }
    }

    private int findTotalNodesCount(TreeNode root) {
        if(root == null) return 0;

        int ans = 1 + findTotalNodesCount(root.left) + findTotalNodesCount(root.right);

        return ans;
    }
}
// https://leetcode.com/problems/check-completeness-of-a-binary-tree/

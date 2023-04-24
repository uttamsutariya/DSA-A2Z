package _11_heaps.medium;

import _13_binary_trees.medium.CheckCompleteness;

public class IsBinaryTreeHeap {
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

    // 1) complete binary tree
    // 2) satisfy heap order property

    public boolean checkIsBinaryTreeMaxHeap(TreeNode root) {
        return isCompleteTree(root) && isMaxHeapOrder(root);
    }

    private boolean isCompleteTree(TreeNode root) {
        int currIndex = 0;
        int totalCount = findTotalNodesCount(root);
        return check(root, currIndex, totalCount);
    }

    private boolean isMaxHeapOrder(TreeNode root) {
        /**
         * leaf node
         * only left node
         * both left & right node
         */

        // if leaf node
        if (root.left == null && root.right == null) return true;
            // if only one node
        else if (root.right == null && root.left != null) {
            return root.val > root.left.val;
        }
        // if both nodes
        else if (root.right != null && root.left != null) {
            boolean left = isMaxHeapOrder(root.left);
            boolean right = isMaxHeapOrder(root.right);

            return left && right && root.val > root.left.val && root.val > root.right.val;
        }

        return false;
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

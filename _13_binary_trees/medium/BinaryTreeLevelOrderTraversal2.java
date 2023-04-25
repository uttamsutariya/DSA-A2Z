package _13_binary_trees.medium;

import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {

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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        ArrayDeque<List<Integer>> s = new ArrayDeque<>();    // stack

        q.offer(root);

        while(!q.isEmpty()) {
            int qSize = q.size();

            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<qSize ; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

                level.add(curr.val);
            }
            s.push(level);
        }

        List<List<Integer>> ans = new ArrayList<>();

        while(!s.isEmpty()) {
            ans.add(s.pop());
        }

        return ans;
    }
}

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
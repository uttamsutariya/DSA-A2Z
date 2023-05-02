package _13_binary_trees.medium;

public class CheckIfTreeIsHeightBalanced {
      static class TreeNode {
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

    public static boolean isBalanced(TreeNode root) {
        return dfsHeightPostOrder(root) != -1;
    }

    private static int dfsHeightPostOrder(TreeNode root) {
        if(root == null) return 0;

        int lh = dfsHeightPostOrder(root.left);
        if(lh == -1) return -1;

        int rh = dfsHeightPostOrder(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh-rh) > 1) return -1;
        return 1 + Math.max(lh, rh);
    }
}

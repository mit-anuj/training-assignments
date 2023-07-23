import javax.swing.tree.TreeNode;

public class binaryTreeToSumTree {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    public static int toSumTree(Node root) {
        if (root != null) {
            int l = toSumTree(root.left);
            int r = toSumTree(root.right);
            int temp = root.data;
            root.data = l + r;
            return temp + l + r;
        } else
            return 0;
    }

    boolean ans = true;

    public boolean isBalanced(TreeNode root) {
        solve(root);
        return ans;
    }

    public int solve(TreeNode root) {
        if (root == null)
            return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        if (Math.abs(left - right) > 1)
            ans = false;
        return Math.max(left, right) + 1;
    }
}

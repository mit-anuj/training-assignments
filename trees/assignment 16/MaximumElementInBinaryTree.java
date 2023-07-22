class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class MaximumElementInBinaryTree {

    public static int findMax(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("The binary tree is empty.");
        }
        return findMaxUtil(root);
    }

    private static int findMaxUtil(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMaxUtil(node.left);
        int rightMax = findMaxUtil(node.right);

        return Math.max(node.val, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);

        int maxElement = findMax(root);
        System.out.println("Maximum element in the binary tree: " + maxElement);
    }
}

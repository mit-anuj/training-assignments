import java.util.Stack;

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

public class PostOrderToTree {

    public static TreeNode buildTree(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);

        stack.push(root);
        for (int i = postorder.length - 2; i >= 0; i--) {
            TreeNode current = new TreeNode(postorder[i]);
            TreeNode lastPopped = null;

            while (!stack.isEmpty() && stack.peek().val < current.val) {
                lastPopped = stack.pop();
            }

            if (lastPopped != null) {
                lastPopped.right = current;
            } else {
                stack.peek().left = current;
            }

            stack.push(current);
        }

        return root;
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = buildTree(postorder);

        System.out.print("Inorder Traversal: ");
        inOrderTraversal(root);

    }
}


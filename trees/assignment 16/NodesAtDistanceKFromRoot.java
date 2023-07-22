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

public class NodesAtDistanceKFromRoot {

    public static void printNodesAtDistanceK(TreeNode root, int k) {
        if (root == null || k < 0) {
            return;
        }
        
        printNodesAtDistanceKUtil(root, k, 0);
    }

    private static void printNodesAtDistanceKUtil(TreeNode node, int k, int distance) {
        if (node == null) {
            return;
        }
        
        if (distance == k) {
            System.out.print(node.val + " ");
            return;
        }

        printNodesAtDistanceKUtil(node.left, k, distance + 1);
        printNodesAtDistanceKUtil(node.right, k, distance + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int k = 2;
        System.out.print("Nodes at distance " + k + " from the root: ");
        printNodesAtDistanceK(root, k);
    }
}


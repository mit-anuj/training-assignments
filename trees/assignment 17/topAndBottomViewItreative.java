import java.util.ArrayList;
import java.util.*;

public class topAndBottomViewItreative {
    public class Node {
        int data;
        Node right;
        Node left;
    }

    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if (map.get(hd) == null)
                map.put(hd, temp.data);
            if (temp.left != null) {
                q.add(new Pair(temp.left, hd - 1));
            }
            if (temp.right != null) {
                q.add(new Pair(temp.right, hd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<Node>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.data);
            if (temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
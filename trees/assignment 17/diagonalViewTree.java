import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import org.w3c.dom.Node;

public class diagonalViewTree {
    public class Node {
        int data;
        Node left;
        Node right;
    }
    public class TNode{
        int data;
        TNode left;
        TNode( Node left,int data){
            this.data = data;
            this.left = left;
        }
    }
    public static void diagonalPrint(Node root) {
        if (root == null)
            return;
        TreeMap<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        Queue<TNode> q = new LinkedList<TNode>();
        q.add(new TNode(root, 0));
        while (!q.isEmpty()) {
            TNode curr = q.poll();
            map.putIfAbsent(curr.level, new ArrayList<>());
            map.get(curr.level).add(curr.node.data);
            if (curr.node.left != null)
                q.add(new TNode(curr.node.left, curr.level + 1));
            if (curr.node.right != null)
                q.add(new TNode(curr.node.right, curr.level));
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int k = entry.getKey();
            List<Integer> l = map.get(k);
            int size = l.size();
            for (int i = 0; i < l.size(); i++) {
                System.out.print(l.get(i));
                System.out.print(" ");
            }
            System.out.println("");
        }
        return;
    }
}

import java.util.Scanner;

public class binaryTrees{
    public class Node {
        int data;
        Node left;
        Node right;
    }
    Node root;
    Scanner sc = new Scanner(System.in);
    public void insertRoot(){
        System.out.println("insert root node :");
        root = new Node();
        int data = sc.nextInt();
        root.data = data; 
        insertChild(root);
    }
    public void insertChild(Node curr){
        System.out.println("insert left child node or -1 for no child:");
        int data = sc.nextInt();
        if(data == -1){
            return;
        }else{
            Node node = new Node();
            node.data = data;
            curr.left = node; 
        }
        insertChild(curr.left);
        System.out.println("insert right child node or -1 for no child:");
        data = sc.nextInt();
        if(data == -1){
            return;
        }else{
            Node node = new Node();
            node.data = data;
            curr.right = node; 
        }
        insertChild(curr.right);
    }

    void print(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        print(node.left);
        print(node.right);
    }

    public static void main(String[] args) {
        binaryTrees b = new binaryTrees();
        b.insertRoot();
        b.print(b.root);
    }
}
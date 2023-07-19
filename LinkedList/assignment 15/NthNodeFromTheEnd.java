public class NthNodeFromTheEnd {
    public class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    public void add(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public int NthNode(int index){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<index;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        NthNodeFromTheEnd f = new NthNodeFromTheEnd();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        f.add(6);
        System.out.println(f.NthNode(3));
    }
}

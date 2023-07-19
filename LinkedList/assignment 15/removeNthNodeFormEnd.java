import org.w3c.dom.Node;

public class removeNthNodeFormEnd {
    public class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    public void remove(int k){
        Node slow = head;
        Node fast = head;
        for(int i=0; i<k; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }
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
    public void print(){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        removeNthNodeFormEnd f = new removeNthNodeFormEnd();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        f.add(6);
        // System.out.println(f.findMiddle());'
        f.print();
        f.remove(3);
        f.print();
        
    }
}

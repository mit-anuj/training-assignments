public class findMiddleLL{
    public class Node{
        int data;
        Node next;
    }
    Node head;
    Node tail;
    public  int findMiddle(){
        if(head == null || head.next == null){
            return -1;
        }
        Node fast=head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
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
    public static void main(String[] args) {
        findMiddleLL f = new findMiddleLL();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        f.add(6);
        System.out.println(f.findMiddle());
    }
}
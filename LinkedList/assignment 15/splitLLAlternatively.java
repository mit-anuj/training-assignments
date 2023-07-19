public class splitLLAlternatively {
    public class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    Node head1;
    Node tail1;
    Node head2;
    Node tail2;
    public void split(Node head){
        int count = 0;
        while(head!=null){
            if(count%2==0){
                add1(head.data);
                count++;
            }else{
                add2(head.data);
                count++;
            }
            head = head.next;
        }
    }
    public void add(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void add1(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head1 == null) {
            head1 = newNode;
            tail1 = newNode;
        } else {
            tail1.next = newNode;
            tail1 = newNode;
        }
    }
    public void add2(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head2 == null) {
            head2 = newNode;
            tail2 = newNode;
        } else {
            tail2.next = newNode;
            tail2 = newNode;
        }
    }
    public void print(Node head){
        while (head != null){
            System.out.print(head.data);
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        splitLLAlternatively f = new splitLLAlternatively();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        f.add(6);
        f.split(f.head);
        f.print(f.head1);
        f.print(f.head2);
    }
}

public class removeFromEnd {
    public class Node {
        int data;
        Node next;

    }

    Node head;
    Node tail;
    int size = 0;

    public void addAtLast(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node removeNthFromEnd(int k) {
        int i = 0;
        Node first = head;
        Node second = head;
        if (head.next == null && (k == 1 || k == 0)) {
            head = head.next;
        } else {
            while (i < k) {
                first = first.next;
                i++;
            }
            if (first == null) {
                head = head.next;
            } else {
                while (first.next != null) {
                    first = first.next;
                    second = second.next;
                }
                second.next = second.next.next;
            }
        }
        return head;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        removeFromEnd node = new removeFromEnd();
        node.addAtLast(1);
        node.addAtLast(2);
        node.print();
        Node head = node.removeNthFromEnd(1);
        if (head == null) {
            System.out.println("null");
        } else {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
}

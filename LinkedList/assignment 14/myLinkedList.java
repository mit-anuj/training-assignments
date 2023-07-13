
public class myLinkedList {
    public class Node {
        int val;
        Node next;
    }

    Node head;
    Node tail;

    public myLinkedList() {
        Node node = new Node();
    }

    int size = 0;

    public int get(int index) {
        int i = 0;
        if (head == null || index >= size) {
            return -1;
        }
        Node curr = head;
        while (i < index) {
            curr = curr.next;
            i++;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node newHead = new Node();
        newHead.val = val;
        newHead.next = null;
        if (head == null) {
            head = newHead;
            tail = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node temp = new Node();
        temp.val = val;
        temp.next = null;
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        } else if (index == size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else {
            Node temp = new Node();
            temp.next = null;
            temp.val = val;
            int i = 0;
            Node curr = head;
            while (i < index - 1) {
                curr = curr.next;
                i++;
            }
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public void deleteAtIndex(int index) {
        int i = 0;
        Node curr = head;
        if (head == null || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            while (i < index - 1) {
                curr = curr.next;
                i++;
            }
            curr.next = curr.next.next;
        }  
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        myLinkedList node = new myLinkedList();
        node.addAtHead(1);
        node.addAtTail(3);
        node.addAtIndex(1, 2);
        System.out.println(node.get(1));
        node.deleteAtIndex(0);
        System.out.println(node.get(0));
        System.out.println(node.get(2));

        // System.out.println(node.get(1));
        // node.addAtHead(3);
        // node.addAtHead(4);
        // node.addAtHead(5);
        // node.addAtTail(45);
        // System.out.println(node.get(2));
        // node.print();
        // System.out.println(node.size);
        // System.out.println(node.get(3));
    }
}
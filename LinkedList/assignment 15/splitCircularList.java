public class splitCircularList {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }

        static LinkedListNode<Integer> newHead1;
        static LinkedListNode<Integer> newHead2;
        static LinkedListNode<Integer> newTail1;
        static LinkedListNode<Integer> newTail2;
        static LinkedListNode<Integer> head;
        static LinkedListNode<Integer> tail;

        public static void addAtLast(Integer data) {
            LinkedListNode<Integer> node = new LinkedListNode<Integer>();
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        public static void add(int data, LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {

        }

        public static void splitCircularList(LinkedListNode<Integer> head) {

            // Write your code here
            LinkedListNode<Integer> slow = head;
            LinkedListNode<Integer> fast = head;
            // int size = 0;
            while (fast.next.next != head) {
                fast = fast.next.next;
                slow = slow.next;
            }
            LinkedListNode<Integer> curr = head;
            while (slow.next != curr) {
                add(curr.data, newHead1, newTail1);
                curr = curr.next;
            }
            newTail1.next = newHead1;
            while (curr != head) {
                add(curr.data, newHead2, newTail2);
                curr = curr.next;
            }
            newTail2.next = newHead2;
        }
    }

}

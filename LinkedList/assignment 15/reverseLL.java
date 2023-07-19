public class reverseLL {
    public class ListNode{
        int data;
        ListNode next;
    }
    public ListNode head;
    public void reverseList(ListNode first,ListNode second){
        if(first == null){
            return ;
        }
        reverseList(first.next,first);
        if(first.next==null){
            head = first;
        }
        first.next=second;

    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        this.head=head;
        reverseList(head,null);
        return head;
    }
}

public class linkedListCycle {
    public class ListNode{
        int data;
        ListNode next;
    }
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        
        // ListNode p=head;
        // ListNode q=head.next;
        // while(p!=null){
        //     while(q!=null){
        //         if(q.next==p)
        //             return true;
        //         q=q.next;
        //     }
        //     p=p.next;
        //     q=p.next;
        // }
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            return true;
        }
        return false;
    }
}

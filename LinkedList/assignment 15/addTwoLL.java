public class addTwoLL {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode (0);// creating new List.
        ListNode curr=newHead;// using curr we will traverse this new List.
        int carry=0;
        int x,y;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null)
                x=l1.val;
            else
                x=0;
            if(l2!=null)
                y=l2.val;
            else
                y=0;
            int sum=x+y+carry;
            carry=sum/10;//calculating carry
            curr.next=new ListNode(sum%10);// creating a new node and adding that node in the last of the new List.
            curr=curr.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return newHead.next;
    }
}

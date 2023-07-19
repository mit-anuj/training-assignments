import java.util.List;

public class intersectionOfTwoLL {
    public class ListNode{
        ListNode next;
        int val;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA=headA;
        ListNode currB = headB;
        while(currA!=currB){
            if(currA == null){
                currA= headB;
            }else
                currA=currA.next;
             if(currB==null){
                currB=headA;
            }
            else
                currB=currB.next;
        }
        return currA;
    }
}

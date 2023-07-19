public class palindromeLL {
    public class ListNode{
        int val;
        ListNode next;
    }
    public boolean isPalindrome(ListNode head) {
        String str="";
        while(head!=null){
            str=str+head.val;
            head=head.next;
        }
        int start=0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start=start+1;
            end=end-1;
        }
        return true;
    }
}

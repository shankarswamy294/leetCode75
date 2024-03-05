public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
            return null;

        ListNode t1=head;
        ListNode t2=head;
        ListNode prev=null;

        while(t2.next!=null && t2.next.next!=null){
            prev = t1;
            t1=t1.next;
            t2=t2.next.next;
        }

        if(t2.next==null){
            prev.next = prev.next.next;
        }

        if(t2.next!=null && t2.next.next==null){
            t1.next=t1.next.next;
        }

        return head;
    }
}
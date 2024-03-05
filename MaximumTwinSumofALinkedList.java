public class MaximumTwinSumofALinkedList {
    int maxSum = 0;
    public ListNode rec(ListNode head, ListNode oh){
        if(head==null)
            return oh;
        oh = rec(head.next, oh);
        if(oh!=null && oh!=head){
            maxSum = Math.max((oh.val + head.val), maxSum);
        }
        return oh.next;
    }
    public int pairSum(ListNode head) {
        rec(head, head);
        return maxSum;
    }
}
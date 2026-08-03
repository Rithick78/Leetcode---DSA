class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fastp = dummy;
        ListNode slowp = dummy;

        for (int i = 0; i < n; i++) {
            fastp = fastp.next;
        }
        
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }
        slowp.next = slowp.next.next;

        return dummy.next;
    }
}
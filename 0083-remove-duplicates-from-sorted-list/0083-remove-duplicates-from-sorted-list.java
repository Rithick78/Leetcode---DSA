class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode move = head.next;

        while (move != null) {

            if (temp.val != move.val) {
                temp.next = move;
                temp = move;
            }

            move = move.next;
        }

        // Remove remaining duplicate nodes
        temp.next = null;

        return head;
    }
}
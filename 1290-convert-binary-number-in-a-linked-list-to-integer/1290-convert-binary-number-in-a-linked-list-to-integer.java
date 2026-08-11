/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        
        temp = head;
        int sum = 0;
        int m = 0;

        while(temp != null){
            m++;
            sum += (int)(temp.val * (Math.pow(2,n-m)));
            temp = temp.next;
        }
        return sum;
    }
}
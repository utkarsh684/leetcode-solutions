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
class leetcode876 {
    public ListNode middleNode(ListNode head) {
        // using floyd algorithm for linked cycle

        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
}

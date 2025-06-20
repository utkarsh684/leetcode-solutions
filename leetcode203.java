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
class leetcode203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dull=new ListNode(0);
        dull.next=head;
        ListNode dummy=dull;
        while(dummy.next!=null){
            if(dummy.next.val==val){
                dummy.next=dummy.next.next;
            }
            else{
                dummy=dummy.next;
            }
        }
        return dull.next;
    }
}

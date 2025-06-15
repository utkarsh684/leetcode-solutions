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
class leetcode234 {
    public boolean isPalindrome(ListNode head) {
        String str="";
        while(head!=null){
            str=str+head.val;
            head=head.next;
        }

        int first=0;
        int last=str.length()-1;
        while(first<last){
            if((int)str.charAt(first)!=(int)str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}

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
    public ListNode oddEvenList(ListNode head) {
        ListNode cur = head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode odd_head = odd;
        ListNode even_head= even;

        ListNode temp = head;
        while(temp!=null){
            if(cur.val%2 == 0 ){
                even_head.next = temp;
                even_head= even_head.next;
            }
            else{
                odd_head.next = temp;
                odd_head = odd_head.next;
            }
            temp = temp.next;
            cur = cur.next;
        }
        even_head.next = null;
        odd_head.next = even.next;

        return odd.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        ListNode currodd = head;
        ListNode evenhead = head.next;
        ListNode curreven = evenhead;
        while(curreven != null && currodd != null)
        {
            currodd.next = curreven.next;
            if(currodd.next == null)
                break;
            currodd = currodd.next;
            curreven.next = currodd.next;
            curreven = curreven.next;
        }
        currodd.next = evenhead;
        return head;
    }
}

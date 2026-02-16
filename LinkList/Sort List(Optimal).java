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
    public ListNode sortList(ListNode head) {
       if(head == null || head.next == null){
        return head;
       }
      // Finding Middle and applying merge sort for sorting
        ListNode middle = Middle(head);
        ListNode rights = middle.next;
      //breaking into two parts
        middle.next = null;
      // recursive  call for spliting again
        ListNode left = sortList(head);
        ListNode right = sortList(rights);
      // merging the halfs
         return merge(left,right);
    }
    public ListNode Middle(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
            if(l1.val < l2.val){
                l1.next = merge(l1.next,l2);
                return l1;
            }else{
                l2.next = merge(l1,l2.next);
                return l2;  
            }
    }
}

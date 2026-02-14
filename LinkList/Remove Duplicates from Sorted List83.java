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
    public ListNode deleteDuplicates(ListNode head) {
// Brute force 
        if(head == null || head.next == null){
            return head;
        }
        // ListNode temp = head.next;
        // ListNode prev = head;
        // while(temp!= null){
        //     if(temp.val == prev.val){
        //         prev.next = temp.next;
        //         temp = temp.next;
        //     }else{
        //         prev = temp;
        //         temp = temp.next;
        //     }
        // }
        // return head;

// Bit more thinking

      ListNode temp = head;
      while(temp.next != null){
         if(temp.val == temp.next.val){
            temp.next = temp.next.next;
         }else{
            temp = temp.next;
         }
      }
return head;
    }
}

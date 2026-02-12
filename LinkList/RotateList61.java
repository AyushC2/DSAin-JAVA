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
//Approach
// Find the length of the linked list
// Connect the last node to the first node to make the list circular
// Reduce k using modulo 
// Calculate the position where the list should be broken
// Break the circular link at that position
// Return the new head of the rotated list

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next == null || k == 0){
        return head;
       }

        int n = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        temp.next = head;
        k = k % n;
        int steps = n - k;
        int count = 0;
        ListNode temp1 = head;
        for(int i = 1; i < steps;i++){
            temp1 = temp1.next;
        }
        head = temp1.next;
        temp1.next = null;
        return head;
    }
}

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
             public ListNode removeNthFromEnd(ListNode head, int n) {
                     ListNode temp1 = head;
                             ListNode temp2 = head;
                                     if (head == null){
                                                 return null;
                                                         }
                                                                 int size = 1;
                                                                         while (temp1.next != null){
                                                                                     temp1  = temp1.next;
                                                                                                 size++;
                                                                                                         }
                                                                                                                 
                                                                                                                         if (size == n){
                                                                                                                                     return head.next;
                                                                                                                                             }

                                                                                                                                                     for (int i = 1; i < (size - n); i++){
                                                                                                                                                                 temp2 = temp2.next;
                                                                                                                                                                         }

                                                                                                                                                                                 temp2.next = temp2.next.next;
                                                                                                                                                                                         return head;
                                                                                                                                                                                                 

                                                                                                                                                                                                     }
                                                                                                                                                                                                     }
/*83. Remove Duplicates from Sorted List (Easy)
 * 
 * Given a sorted linked list, delete all duplicates such that 
 * each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */

package com.code;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RemoveDuplicateFromSortedLinkedList {
	public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
     return head;
    }
    
    if (head!=null && head.next==null){
        return head;
    }
    
    if (head!=null && head.next!=null && head.val==head.next.val ){
        head.next=head.next.next;
        deleteDuplicates(head);
    }
    
   if (head!=null && head.next!=null && head.val!=head.next.val ){
       deleteDuplicates(head.next);
   }
    
    return head;
    }
}

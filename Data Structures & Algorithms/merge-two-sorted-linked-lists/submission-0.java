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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList= new ListNode(0);
        ListNode current = mergedList;
        if(list1 == null && list2 == null){
            return null;
        }
         while (list1 != null && list2 != null) {
            if(list2.val >= list1.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
         }
          current.next = (list1 != null) ? list1 : list2;
         return mergedList.next;
    }
}
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
        //Usamos metodo recursivo para resolver este problema
      
        ListNode a = list1;
        ListNode b = list2;

        ListNode result = null;

        // Base cases
        if (a == null)
            return b;
        else if (b == null)
            return a;

        
        if (a.val <= b.val) {
            result = a;
            result.next
                = mergeTwoLists(a.next, b);
        }
        else {
            result = b;
            result.next
                = mergeTwoLists(a, b.next);
        }
        return result;
    //Paso todos los test de leetcode
    }
}

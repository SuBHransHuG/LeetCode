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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> aL = new ArrayList<>();
        while(head != null){
            aL.add(head.val);
            head = head.next;
        }
       Object[] objects = aL.toArray();
       int n = objects.length;
       int j = n-1;
       for(int i =0;i<n;i++){
        if(objects[i]!=objects[j]){
            return false;
        }
        j--;
       }
       return true;
    }
}

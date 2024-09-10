import java.math.BigInteger;
        class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            BigInteger a = new BigInteger(String.valueOf(temp.val));
            BigInteger b = new BigInteger(String.valueOf(temp.next.val));
            BigInteger result = a.gcd(b);
            
            ListNode node1 = new ListNode(result.intValue());  
            
            node1.next = temp.next;  
            temp.next = node1;
            
            temp = node1.next;  
        }
        return head;
    }
}

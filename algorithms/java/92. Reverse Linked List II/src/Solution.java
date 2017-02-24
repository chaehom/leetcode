
/**
 * 92. Reverse Linked List II
 * 
 * @author leo.ch
 * @since  2017-02-24
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode list = new ListNode(0);
        list.next = head;
        
        ListNode p = list;
        for (int i = 0; i < m - 1; i++)
        {
        	p = p.next;
        }
        ListNode r = p.next;
        for (int i = m; i < n; i++)
        {
        	r = r.next;
        }

        ListNode q = p.next;
        while (q != r)
        {
        	p.next = q.next;
        	q.next = r.next;
        	r.next = q;
        	q = p.next;
        }
        
        return list.next;
    }
}

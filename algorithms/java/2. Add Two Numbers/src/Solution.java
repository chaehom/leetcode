/**
 * 2. Add Two Numbers
 * 
 * @author leo.ch
 * @since  2017-02-05
 */
public class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
    	ListNode head = new ListNode(0);
    	ListNode p1 = l1, p2 = l2, p = head;
    	int c = 0;
    	
    	while (null != p1 || null != p2)
    	{
    		int n1 = (null == p1) ? 0 : p1.val;
    		int n2 = (null == p2) ? 0 : p2.val;
    		int sum = n1 + n2 + c;
    		c = sum / 10;
    		p.next = new ListNode(sum % 10);
    		p = p.next;
    		if (null != p1) 
    		{
    			p1 = p1.next;
    		}
    		if (null != p2)
    		{
    			p2 = p2.next;
    		}
    	}
    	if (c > 0)
    	{
    		p.next = new ListNode(c);
    	}
    	return head.next;
    }
}

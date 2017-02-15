
/**
 * 24. Swap Nodes in Pairs
 * 
 * @author leo.ch
 * @since  2017-02-15
 */
public class Solution 
{
	public ListNode swapPairs(ListNode head) 
	{
		if (head == null || head.next == null)
		{
			return head;
		}
		ListNode h = head.next, p = head, q = null, r = null;
		while (p != null)
		{
			q = p.next;
			if (q != null)
			{
				p.next = q.next;
				q.next = p;
				if (null != r)
				{
					r.next = q;
				}
				r = p;
			}
			p = p.next;
		}
		return h;
    }
}

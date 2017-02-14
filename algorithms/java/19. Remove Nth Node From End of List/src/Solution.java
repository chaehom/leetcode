/**
 * 19. Remove Nth Node From End of List
 * 
 * @author leo.ch
 * @since  2017-02-14
 */
public class Solution 
{
	public ListNode removeNthFromEnd(ListNode head, int n) 
	{
		ListNode h = new ListNode(0);
		h.next = head;
		ListNode p = h, q = h;
		while (n-- >= 0 && p != null)
		{
			p = p.next;
		}
		while (p != null)
		{
			p = p.next;
			q = q.next;
		}
		q.next = q.next.next;
		return h.next;
    }
}

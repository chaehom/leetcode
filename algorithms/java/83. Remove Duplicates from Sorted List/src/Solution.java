/**
 * 83. Remove Duplicates from Sorted List
 * 
 * @author leo.ch
 * @since  2017-02-22
 */
public class Solution
{
	public ListNode deleteDuplicates(ListNode head)
	{
		if (null == head)
		{
			return null;
		}
		ListNode p = new ListNode(0), cur = head;
		p.next = head;
		while (p != null)
		{
			p = p.next;
			while (p != null && p.val == cur.val)
			{
				p = p.next;
			}
			cur.next = p;
			cur = p;
		}
		return head;
	}
}

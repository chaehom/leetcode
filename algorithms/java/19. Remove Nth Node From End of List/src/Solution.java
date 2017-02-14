import java.util.ArrayList;
import java.util.List;

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
		List<ListNode> rec = new ArrayList<ListNode>();
		ListNode lstHead = new ListNode(0);
		lstHead.next = head;
		rec.add(lstHead);
		ListNode p = lstHead.next;
		while (null != p)
		{
			rec.add(p);
			p = p.next;
		}
		rec.get(rec.size() - n - 1).next = rec.get(rec.size() - n).next;
		return lstHead.next;
    }
}

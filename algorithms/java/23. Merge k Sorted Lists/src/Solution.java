
/**
 * 23. Merge k Sorted Lists
 * 
 * @author leo.ch
 * @since  2017-02-14
 */
public class Solution 
{
	public ListNode mergeKLists(ListNode[] lists) 
	{
        return partion(lists, 0, lists.length - 1);
    }

	private ListNode partion(ListNode[] lists, int start, int end) 
	{
		if (start == end)
		{
			return lists[start];
		}
		else if (start < end)
		{
			int mid = (start + end) / 2;
			ListNode l1 = partion(lists, start, mid);
			ListNode l2 = partion(lists, mid + 1, end);
			return mergeTwoLists(l1, l2);
		}
		else
		{
			return null;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
    	if (null == l1)
    	{
    		return l2;
    	}
    	if (null == l2)
    	{
    		return l1;
    	}
    	
    	if (l1.val < l2.val)
    	{
    		l1.next = mergeTwoLists(l1.next, l2);
    		return l1;
    	}
    	else
    	{
    		l2.next = mergeTwoLists(l1, l2.next);
    		return l2;
    	}
    }
}

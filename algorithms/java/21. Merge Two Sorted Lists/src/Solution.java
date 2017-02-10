
/**
 * 21. Merge Two Sorted Lists
 * 
 * @author leo.ch
 * @since  2017-02-10
 */
public class Solution 
{
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

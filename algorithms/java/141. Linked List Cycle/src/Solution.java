
/**
 * 141. Linked List Cycle
 * 
 * @author leo.ch
 * @since  2017-03-02
 */
public class Solution
{
    public boolean hasCycle(ListNode head)
    {
    	if (null == head)
    	{
    		return false;
    	}
    	
        ListNode fast = head;
        ListNode slow = head;
        while (null != fast.next && null != fast.next.next)
        {
        	fast = fast.next.next;
        	slow = slow.next;
        	if (fast == slow)
        	{
        		return true;
        	}
        }
        return false;
    }
}

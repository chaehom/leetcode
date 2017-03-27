
/**
 * 234. Palindrome Linked List
 * 
 * @author leo.ch
 * @since  2017-03-27
 */
public class Solution
{
    public boolean isPalindrome(ListNode head)
    {
        ListNode slow = head, fast = head;
        while (null != fast && null != fast.next)
        {
        	fast = fast.next.next;
        	slow = slow.next;
        }
        fast = head;
        slow = reverse(slow);
        while (slow != null)
        {
        	if (fast.val != slow.val)
        	{
        		return false;
        	}
        	fast = fast.next;
        	slow = slow.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head)
    {
    	ListNode prev = null;
    	while (head != null)
    	{
    		ListNode next = head.next;
    		head.next = prev;
    		prev = head;
    		head = next;
    	}
    	return prev;
    }
}

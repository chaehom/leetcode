
/**
 * 237. Delete Node in a Linked List
 * 
 * @author leo.ch
 * @since  2017-03-24
 */
public class Solution {
    public void deleteNode(ListNode node) {
    	if (null != node && null != node.next)
    	{
	        node.val = node.next.val;
	        node.next = node.next.next;
    	}
    }
}

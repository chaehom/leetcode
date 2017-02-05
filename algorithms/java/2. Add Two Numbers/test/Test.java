import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 2. Add Two Numbers
 * 
 * @author leo.ch
 * @since  2017-02-05
 */
public class Test {

	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		
		int[] l1Nums = {2, 4, 3};
		int[] l2Nums = {5, 6, 4};
		ListNode l1 = makeListNode(l1Nums);
		ListNode l2 = makeListNode(l2Nums);
		
		int[] expected = {7, 0, 8};
		
		ListNode actuals = solution.addTwoNumbers(l1, l2);
		checkListNodes(expected, actuals);
	}
	
	@org.junit.Test
	public void test2() {
		Solution solution = new Solution();
		
		int[] l1Nums = {6, 7, 2, 8, 1};
		int[] l2Nums = {5, 6, 4};
		ListNode l1 = makeListNode(l1Nums);
		ListNode l2 = makeListNode(l2Nums);
		
		int[] expected = {1, 4, 7, 8, 1};
		
		ListNode actuals = solution.addTwoNumbers(l1, l2);
		checkListNodes(expected, actuals);
	}

	ListNode makeListNode(int[] nums)
	{
		ListNode l = new ListNode(0);
		ListNode iter = l;
		for (int i : nums)
		{
			iter.next = new ListNode(i);
			iter = iter.next;
		}
		return l.next;
	}
	
	void checkListNodes(int[] expected, ListNode actual)
	{
		for (int i = 0; actual != null; i++, actual = actual.next)
		{
			assertEquals(expected[i], actual.val);
		}
	}
}

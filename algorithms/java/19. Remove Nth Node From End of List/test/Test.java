import static org.junit.Assert.*;

/**
 * 19. Remove Nth Node From End of List
 * 
 * @author leo.ch
 * @since  2017-02-14
 */
public class Test {
	
	private Solution solution = new Solution();

	@org.junit.Test
	public void test1() 
	{
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);
		
		int[] expected = {1, 2, 3, 5};
		
		ListNode actuals = solution.removeNthFromEnd(list, 2);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test2() 
	{
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);
		
		int[] expected = {2, 3, 4, 5};
		
		ListNode actuals = solution.removeNthFromEnd(list, 5);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test3() 
	{
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);
		
		int[] expected = {1, 2, 3, 4, 5};
		
		ListNode actuals = solution.removeNthFromEnd(list, 1);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test4() 
	{
		int[] nums = {1};
		ListNode list = makeListNode(nums);
		
		int[] expected = {};
		
		ListNode actuals = solution.removeNthFromEnd(list, 1);
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

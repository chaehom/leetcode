import static org.junit.Assert.*;

/**
 * 23. Merge k Sorted Lists
 * 
 * @author leo.ch
 * @since  2017-02-14
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() 
	{
		ListNode[] lists = {
			makeListNode(new int[]{2, 3, 4}),
			makeListNode(new int[]{1})
		};

		int[] expected = {1, 2, 3, 4};

		ListNode actuals = solution.mergeKLists(lists);
		checkListNodes(expected, actuals);
	}
	
	@org.junit.Test
	public void test2() 
	{
		ListNode[] lists = {
			makeListNode(new int[]{2, 3, 4}),
			makeListNode(new int[]{1}),
			makeListNode(new int[]{5, 6, 7, 8, 9}),
			makeListNode(new int[]{2, 3, 10}),
		};

		int[] expected = {1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10};

		ListNode actuals = solution.mergeKLists(lists);
		checkListNodes(expected, actuals);
	}
	
	@org.junit.Test
	public void test3() 
	{
		ListNode[] lists = {
		};

		int[] expected = {};

		ListNode actuals = solution.mergeKLists(lists);
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

import static org.junit.Assert.*;

/**
 * 24. Swap Nodes in Pairs
 * 
 * @author leo.ch
 * @since  2017-02-15
 */
public class Test {

	private Solution solution = new Solution();

	@org.junit.Test
	public void test1()
	{
		int[] nums = {1, 2, 3, 4};
		ListNode list = makeListNode(nums);

		int[] expected = {2, 1, 4, 3};
		ListNode actuals = solution.swapPairs(list);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test2()
	{
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);

		int[] expected = {2, 1, 4, 3, 5};
		ListNode actuals = solution.swapPairs(list);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test3()
	{
		int[] nums = {1, 2};
		ListNode list = makeListNode(nums);

		int[] expected = {2, 1};
		ListNode actuals = solution.swapPairs(list);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test4()
	{
		int[] nums = {1};
		ListNode list = makeListNode(nums);

		int[] expected = {1};
		ListNode actuals = solution.swapPairs(list);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test5()
	{
		int[] nums = {};
		ListNode list = makeListNode(nums);

		int[] expected = {};
		ListNode actuals = solution.swapPairs(list);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test6()
	{
		int[] nums = {2, 5, 3, 4, 6, 2, 2};
		ListNode list = makeListNode(nums);

		int[] expected = {5, 2, 4, 3, 2, 6, 2};
		ListNode actuals = solution.swapPairs(list);
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

import static org.junit.Assert.*;

/**
 * 92. Reverse Linked List II
 * 
 * @author leo.ch
 * @since  2017-02-24
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);

		int[] expected = {1, 4, 3, 2, 5};

		ListNode actuals = solution.reverseBetween(list, 2, 4);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test2() 
	{
		Solution solution = new Solution();
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);

		int[] expected = {5, 4, 3, 2, 1};

		ListNode actuals = solution.reverseBetween(list, 1, 5);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test3() 
	{
		Solution solution = new Solution();
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);

		int[] expected = {4, 3, 2, 1, 5};

		ListNode actuals = solution.reverseBetween(list, 1, 4);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test4() 
	{
		Solution solution = new Solution();
		int[] nums = {1, 2, 3, 4, 5};
		ListNode list = makeListNode(nums);

		int[] expected = {1, 2, 3, 4, 5};

		ListNode actuals = solution.reverseBetween(list, 3, 3);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test5() 
	{
		Solution solution = new Solution();
		int[] nums = {};
		ListNode list = makeListNode(nums);

		int[] expected = {};

		ListNode actuals = solution.reverseBetween(list, 0, 0);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test6() 
	{
		Solution solution = new Solution();
		int[] nums = {1};
		ListNode list = makeListNode(nums);

		int[] expected = {1};

		ListNode actuals = solution.reverseBetween(list, 1, 1);
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

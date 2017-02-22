import static org.junit.Assert.*;

/**
 * 83. Remove Duplicates from Sorted List
 * 
 * @author leo.ch
 * @since  2017-02-22
 */
public class Test {
	
	@org.junit.Test
	public void test1()
	{
		Solution solution = new Solution();
		int[] nums = {1, 1, 2};
		ListNode head = makeListNode(nums);
		
		int[] expected = {1, 2};
		ListNode actuals = solution.deleteDuplicates(head);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test2()
	{
		Solution solution = new Solution();
		int[] nums = {1, 1, 2, 3, 3};
		ListNode head = makeListNode(nums);
		
		int[] expected = {1, 2, 3};
		ListNode actuals = solution.deleteDuplicates(head);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test3()
	{
		Solution solution = new Solution();
		int[] nums = {};
		ListNode head = makeListNode(nums);
		
		int[] expected = {};
		ListNode actuals = solution.deleteDuplicates(head);
		checkListNodes(expected, actuals);
	}

	@org.junit.Test
	public void test4()
	{
		Solution solution = new Solution();
		int[] nums = {1};
		ListNode head = makeListNode(nums);
		
		int[] expected = {1};
		ListNode actuals = solution.deleteDuplicates(head);
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

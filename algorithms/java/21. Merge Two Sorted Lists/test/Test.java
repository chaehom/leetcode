import static org.junit.Assert.*;

/**
 * 21. Merge Two Sorted Lists
 * 
 * @author leo.ch
 * @since  2017-02-10
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() 
	{
		int[] l1Nums = {2, 3, 4};
		int[] l2Nums = {1};
		ListNode l1 = makeListNode(l1Nums);
		ListNode l2 = makeListNode(l2Nums);

		int[] expected = {1, 2, 3, 4};

		ListNode actuals = solution.mergeTwoLists(l1, l2);
		checkListNodes(expected, actuals);
	}
	
	@org.junit.Test
	public void test2() 
	{
		int[] l1Nums = {2, 3, 4, 7};
		int[] l2Nums = {1, 5, 8, 9};
		ListNode l1 = makeListNode(l1Nums);
		ListNode l2 = makeListNode(l2Nums);

		int[] expected = {1, 2, 3, 4, 5, 7, 8, 9};

		ListNode actuals = solution.mergeTwoLists(l1, l2);
		checkListNodes(expected, actuals);
	}
	
	@org.junit.Test
	public void test3() 
	{
		int[] l1Nums = {};
		int[] l2Nums = {1, 5, 8, 9};
		ListNode l1 = makeListNode(l1Nums);
		ListNode l2 = makeListNode(l2Nums);

		int[] expected = {1, 5, 8, 9};

		ListNode actuals = solution.mergeTwoLists(l1, l2);
		checkListNodes(expected, actuals);
	}
	
	@org.junit.Test
	public void test4() 
	{
		int[] l1Nums = {1, 5, 8, 9};
		int[] l2Nums = {};
		ListNode l1 = makeListNode(l1Nums);
		ListNode l2 = makeListNode(l2Nums);

		int[] expected = {1, 5, 8, 9};

		ListNode actuals = solution.mergeTwoLists(l1, l2);
		checkListNodes(expected, actuals);
	}
	
	@org.junit.Test
	public void test5() 
	{
		int[] l1Nums = {};
		int[] l2Nums = {};
		ListNode l1 = makeListNode(l1Nums);
		ListNode l2 = makeListNode(l2Nums);

		int[] expected = {};

		ListNode actuals = solution.mergeTwoLists(l1, l2);
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

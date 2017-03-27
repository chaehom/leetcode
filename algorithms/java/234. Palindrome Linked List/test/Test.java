import static org.junit.Assert.*;

/**
 * 234. Palindrome Linked List
 * 
 * @author leo.ch
 * @since  2017-03-27
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		ListNode head = makeListNode(new int[]{1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1});
		assertTrue(solution.isPalindrome(head)); 
	}

	@org.junit.Test
	public void test2() {
		ListNode head = makeListNode(new int[]{1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 0});
		assertFalse(solution.isPalindrome(head)); 
	}

	@org.junit.Test
	public void test3() {
		ListNode head = makeListNode(new int[]{1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1});
		assertTrue(solution.isPalindrome(head)); 
	}

	@org.junit.Test
	public void test4() {
		ListNode head = makeListNode(new int[]{1});
		assertTrue(solution.isPalindrome(head)); 
	}

	@org.junit.Test
	public void test5() {
		ListNode head = makeListNode(new int[]{1, 1});
		assertTrue(solution.isPalindrome(head)); 
	}

	@org.junit.Test
	public void test6() {
		ListNode head = makeListNode(new int[]{1, 2});
		assertFalse(solution.isPalindrome(head)); 
	}

	@org.junit.Test
	public void test7() {
		ListNode head = makeListNode(new int[]{2});
		assertTrue(solution.isPalindrome(head)); 
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

}

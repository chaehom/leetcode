import static org.junit.Assert.*;

/**
 * 141. Linked List Cycle
 * 
 * @author leo.ch
 * @since  2017-03-02
 */
public class Test {

	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		ListNode item0 = new ListNode(0);
		ListNode item1 = new ListNode(1);
		item0.next = item1;
		ListNode item2 = new ListNode(2);
		item1.next = item2;
		ListNode item3 = new ListNode(3);
		item2.next = item3;
		ListNode item4 = new ListNode(4);
		item3.next = item4;
		item4.next = item0;
		
		assertTrue(solution.hasCycle(item0));
	}

	@org.junit.Test
	public void test2() {
		Solution solution = new Solution();
		ListNode item0 = new ListNode(0);
		ListNode item1 = new ListNode(1);
		item0.next = item1;
		ListNode item2 = new ListNode(2);
		item1.next = item2;
		ListNode item3 = new ListNode(3);
		item2.next = item3;
		ListNode item4 = new ListNode(4);
		item3.next = item4;
		
		assertFalse(solution.hasCycle(item0));
	}
}

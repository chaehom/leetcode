import static org.junit.Assert.*;

/**
 * 35. Search Insert Position
 * 
 * @author leo.ch
 * @since  2017-02-13
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(2, solution.searchInsert(new int[]{1,3,5,6}, 5));
		assertEquals(1, solution.searchInsert(new int[]{1,3,5,6}, 2));
		assertEquals(4, solution.searchInsert(new int[]{1,3,5,6}, 7));
		assertEquals(0, solution.searchInsert(new int[]{1,3,5,6}, 0));
		assertEquals(0, solution.searchInsert(new int[]{}, 0));
	}

}

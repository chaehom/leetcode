import static org.junit.Assert.*;

/**
 * 33. Search in Rotated Sorted Array
 * 
 * @author leo.ch
 * @since  2017-02-13
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
		assertEquals(4, solution.search(nums, 0));
		assertEquals(5, solution.search(nums, 1));
		assertEquals(6, solution.search(nums, 2));
		assertEquals(7, solution.search(nums, 3));
		assertEquals(0, solution.search(nums, 4));
		assertEquals(1, solution.search(nums, 5));
		assertEquals(2, solution.search(nums, 6));
		assertEquals(3, solution.search(nums, 7));
		assertEquals(-1, solution.search(nums, 8));
	}

	@org.junit.Test
	public void test2() {
		int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
		assertEquals(3, solution.search(nums, 1));
		assertEquals(-1, solution.search(nums, 2));
	}

	@org.junit.Test
	public void test3() {
		int[] nums = {2, 3, 4, 5, 6, 1, 1, 1};
		assertEquals(0, solution.search(nums, 2));
		assertEquals(2, solution.search(nums, 4));
		assertEquals(5, solution.search(nums, 1));
	}

	@org.junit.Test
	public void test4() {
		int[] nums = {1};
		assertEquals(0, solution.search(nums, 1));
		assertEquals(-1, solution.search(nums, 4));
	}

	@org.junit.Test
	public void test5() {
		int[] nums = {};
		assertEquals(-1, solution.search(nums, 2));
	}
}

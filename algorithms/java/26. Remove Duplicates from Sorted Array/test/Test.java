import static org.junit.Assert.*;

/**
 * 26. Remove Duplicates from Sorted Array
 * 
 * @author leo.ch
 * @since  2017-02-12
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[] nums = {1,1,2};
		int actual = solution.removeDuplicates(nums);
		assertEquals(2, actual);
	}

	@org.junit.Test
	public void test2() {
		int[] nums = {1, 1, 1 , 1, 2, 2};
		int actual = solution.removeDuplicates(nums);
		assertEquals(2, actual);
	}

	@org.junit.Test
	public void test3() {
		int[] nums = {1, 1, 1 , 1, 2, 2, 3, 4, 5, 5, 5, 5};
		int actual = solution.removeDuplicates(nums);
		assertEquals(5, actual);
	}

	@org.junit.Test
	public void test4() {
		int[] nums = {};
		int actual = solution.removeDuplicates(nums);
		assertEquals(0, actual);
	}

	@org.junit.Test
	public void test5() {
		int[] nums = {1};
		int actual = solution.removeDuplicates(nums);
		assertEquals(1, actual);
	}
}

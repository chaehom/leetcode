import static org.junit.Assert.*;

/**
 * 34. Search for a Range
 * 
 * @author leo.ch
 * @since  2017-02-16
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] expecteds = {3, 4};
		assertArrayEquals(expecteds, solution.searchRange(nums, 8));
	}
	
	@org.junit.Test
	public void test2() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] expecteds = {-1, -1};
		assertArrayEquals(expecteds, solution.searchRange(nums, 1));
	}
	
	@org.junit.Test
	public void test3() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] expecteds = {0, 0};
		assertArrayEquals(expecteds, solution.searchRange(nums, 5));
	}
	
	@org.junit.Test
	public void test4() {
		int[] nums = {};
		int[] expecteds = {-1, -1};
		assertArrayEquals(expecteds, solution.searchRange(nums, 0));
	}
	
	@org.junit.Test
	public void test5() {
		int[] nums = {1};
		int[] expecteds = {0, 0};
		assertArrayEquals(expecteds, solution.searchRange(nums, 1));
	}

}

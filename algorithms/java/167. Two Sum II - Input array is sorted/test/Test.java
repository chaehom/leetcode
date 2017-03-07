import static org.junit.Assert.*;

/**
 * 167. Two Sum II - Input array is sorted
 * 
 * @author leo.ch
 * @since  2017-03-07
 */
public class Test {

	@org.junit.Test
	public void test1() {
	    Solution solution = new Solution();
	    int nums[] = {2, 7, 11, 15};
	    int[] expecteds = {1, 2};
	    int[] actuals = solution.twoSum(nums, 9);
	    assertArrayEquals(expecteds, actuals);
	}

	@org.junit.Test
	public void test2() {
	    Solution solution = new Solution();
	    int nums[] = {3, 4, 2, 5};
	    int[] expecteds = {2, 3};
	    int[] actuals = solution.twoSum(nums, 6);
	    assertArrayEquals(expecteds, actuals);
	}
	
	@org.junit.Test
	public void test3() {
		Solution solution = new Solution();
		int nums[] = {2, 3, 4};
		int[] expecteds = {1, 3};
		int[] actuals = solution.twoSum(nums, 6);
		assertArrayEquals(expecteds, actuals);
	}
}

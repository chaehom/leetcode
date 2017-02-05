import static org.junit.Assert.assertArrayEquals;

public class Test {

	@org.junit.Test
	public void test1() {
	    Solution solution = new Solution();
	    int nums[] = {2, 7, 11, 15};
	    int[] expecteds = {0, 1};
	    int[] actuals = solution.twoSum(nums, 9);
	    assertArrayEquals(expecteds, actuals);
	}


	@org.junit.Test
	public void test2() {
	    Solution solution = new Solution();
	    int nums[] = {3, 4, 2, 5};
	    int[] expecteds = {1, 2};
	    int[] actuals = solution.twoSum(nums, 6);
	    assertArrayEquals(expecteds, actuals);
	}
}

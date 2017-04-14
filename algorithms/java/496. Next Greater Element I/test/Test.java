import static org.junit.Assert.*;

/**
 * 496. Next Greater Element I
 * 
 * @author leo.ch
 * @since  2017-04-14
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[] findNums = {4,1,2};
		int[] nums = {1,3,4,2};
		int[] expecteds = {-1,3,-1};
		assertArrayEquals(expecteds, solution.nextGreaterElement(findNums, nums));
	}

	@org.junit.Test
	public void test2() {
		int[] findNums = {2,4};
		int[] nums = {1,2,3,4};
		int[] expecteds = {3,-1};
		assertArrayEquals(expecteds, solution.nextGreaterElement(findNums, nums));
	}

	@org.junit.Test
	public void test3() {
		int[] findNums = {};
		int[] nums = {};
		int[] expecteds = {};
		assertArrayEquals(expecteds, solution.nextGreaterElement(findNums, nums));
	}

	@org.junit.Test
	public void test4() {
		int[] findNums = {1,3,5,2,4};
		int[] nums = {6,5,4,3,2,1,7};
		int[] expecteds = {7,7,7,7,7};
		assertArrayEquals(expecteds, solution.nextGreaterElement(findNums, nums));
	}
}

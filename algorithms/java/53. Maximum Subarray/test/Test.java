import static org.junit.Assert.*;

/**
 * 53. Maximum Subarray
 * 
 * @author leo.ch
 * @since  2017-03-11
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
		assertEquals(-2, solution.maxSubArray(new int[]{-2}));
		assertEquals(1, solution.maxSubArray(new int[]{1}));
		assertEquals(-1, solution.maxSubArray(new int[]{-2, -1}));
		assertEquals(1, solution.maxSubArray(new int[]{-2, 1}));
		assertEquals(6, solution.maxSubArray(new int[]{1, 2, 3}));
	}

}

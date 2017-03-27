import static org.junit.Assert.*;

/**
 * 268. Missing Number
 * 
 * @author leo.ch
 * @since  2017-03-27
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(1, solution.missingNumber(new int[]{0, 2}));
		assertEquals(3, solution.missingNumber(new int[]{0, 1, 2, 4, 5}));
		assertEquals(0, solution.missingNumber(new int[]{1, 2, 3, 4, 5}));
		assertEquals(6, solution.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 7}));
		assertEquals(0, solution.missingNumber(new int[]{1}));
		assertEquals(0, solution.missingNumber(new int[]{}));
	}

}

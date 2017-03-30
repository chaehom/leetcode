import static org.junit.Assert.*;

/**
 * 326. Power of Three
 * 
 * @author leo.ch
 * @since  2017-03-31
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		int[] allPowerOfThree = new int[]{1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};
		for (int num : allPowerOfThree)
		{
			assertTrue(solution.isPowerOfThree(num));
		}
		
		assertFalse(solution.isPowerOfThree(0));
		assertFalse(solution.isPowerOfThree(2));
		assertFalse(solution.isPowerOfThree(Integer.MAX_VALUE));
		assertFalse(solution.isPowerOfThree(-1));
		assertFalse(solution.isPowerOfThree(Integer.MIN_VALUE));
	}

}

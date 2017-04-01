import static org.junit.Assert.*;

/**
 * 342. Power of Four
 * 
 * @author leo.ch
 * @since  2017-04-01
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.isPowerOfFour(1));
		assertTrue(solution.isPowerOfFour(4));
		assertTrue(solution.isPowerOfFour(16));
		assertTrue(solution.isPowerOfFour(64));
		assertFalse(solution.isPowerOfFour(0));
		assertFalse(solution.isPowerOfFour(2));
		assertFalse(solution.isPowerOfFour(3));
		assertFalse(solution.isPowerOfFour(55555));
	}

}

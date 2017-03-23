import static org.junit.Assert.*;

/**
 * 231. Power of Two
 * 
 * @author leo.ch
 * @since  2017-03-23
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.isPowerOfTwo(1));
		assertTrue(solution.isPowerOfTwo(2));
		assertTrue(solution.isPowerOfTwo(2<<5));
		assertTrue(solution.isPowerOfTwo(2<<29));
		assertFalse(solution.isPowerOfTwo((2<<10)-1));
		assertFalse(solution.isPowerOfTwo(Integer.MAX_VALUE));
	}

}

import static org.junit.Assert.*;

/**
 * 172. Factorial Trailing Zeroes
 * 
 * @author leo.ch
 * @since  2017-03-07
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(0, solution.trailingZeroes(1));
		assertEquals(1, solution.trailingZeroes(5));
		assertEquals(1, solution.trailingZeroes(7));
		assertEquals(2, solution.trailingZeroes(11));
		assertEquals(6, solution.trailingZeroes(25));
	}

}

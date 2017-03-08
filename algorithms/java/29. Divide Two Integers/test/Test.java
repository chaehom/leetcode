import static org.junit.Assert.*;

/**
 * 29. Divide Two Integers
 * 
 * @author leo.ch
 * @since  2017-03-08
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(Integer.MIN_VALUE, solution.divide(Integer.MIN_VALUE, 1));
		assertEquals(Integer.MAX_VALUE, solution.divide(-2147483648, -1));
		assertEquals(Integer.MAX_VALUE, solution.divide(Integer.MAX_VALUE, 1));
		assertEquals(0, solution.divide(0, 1));
		assertEquals(1, solution.divide(1, 1));
		assertEquals(0, solution.divide(1, 2));
		assertEquals(Integer.MAX_VALUE, solution.divide(1, 0));
		assertEquals(-1, solution.divide(2, -2));
		assertEquals(1, solution.divide(3, 2));
		assertEquals(1, solution.divide(-5, -5));
		assertEquals(8, solution.divide(17, 2));
		assertEquals(6, solution.divide(18, 3));
		assertEquals(2, solution.divide(1024, 500));
	}

}

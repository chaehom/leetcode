import static org.junit.Assert.*;

/**
 * 258. Add Digits
 * 
 * @author leo.ch
 * @since  2017-03-14
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(1, solution.addDigits(1));
		assertEquals(9, solution.addDigits(9));
		assertEquals(1, solution.addDigits(10));
		assertEquals(2, solution.addDigits(11));
		assertEquals(4, solution.addDigits(22));
		assertEquals(8, solution.addDigits(80));
		assertEquals(8, solution.addDigits(818));
	}

}

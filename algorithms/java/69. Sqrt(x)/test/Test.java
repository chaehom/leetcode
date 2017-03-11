import static org.junit.Assert.*;

/**
 * 69. Sqrt(x)
 * 
 * @author leo.ch
 * @since  2017-03-11
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(0, solution.mySqrt(0));
		assertEquals(1, solution.mySqrt(1));
		assertEquals(1, solution.mySqrt(2));
		assertEquals(1, solution.mySqrt(3));
		assertEquals(2, solution.mySqrt(4));
		assertEquals(10, solution.mySqrt(100));
	}

}

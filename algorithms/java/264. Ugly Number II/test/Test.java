import static org.junit.Assert.*;

/**
 * 264. Ugly Number II
 * 
 * @author leo.ch
 * @since  2017-03-26
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		//1, 2, 3, 4, 5, 6, 8, 9, 10, 12
		assertEquals(1, solution.nthUglyNumber(1));
		assertEquals(2, solution.nthUglyNumber(2));
		assertEquals(3, solution.nthUglyNumber(3));
		assertEquals(4, solution.nthUglyNumber(4));
		assertEquals(5, solution.nthUglyNumber(5));
		assertEquals(6, solution.nthUglyNumber(6));
		assertEquals(8, solution.nthUglyNumber(7));
		assertEquals(9, solution.nthUglyNumber(8));
		assertEquals(10, solution.nthUglyNumber(9));
		assertEquals(12, solution.nthUglyNumber(10));
	}

}

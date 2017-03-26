import static org.junit.Assert.*;

/**
 * 263. Ugly Number
 * 
 * @author leo.ch
 * @since  2017-03-26
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertFalse(solution.isUgly(0));
		assertFalse(solution.isUgly(-30));
		assertFalse(solution.isUgly(1));
		assertTrue(solution.isUgly(2));
		assertTrue(solution.isUgly(3));
		assertTrue(solution.isUgly(4));
		assertTrue(solution.isUgly(5));
		assertTrue(solution.isUgly(30));
		assertTrue(solution.isUgly(60));
	}

}

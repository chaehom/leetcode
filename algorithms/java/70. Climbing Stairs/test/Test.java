import static org.junit.Assert.*;

/**
 * 70. Climbing Stairs
 * 
 * @author leo.ch
 * @since  2017-02-20
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(0, solution.climbStairs(0));
		assertEquals(1, solution.climbStairs(1));
		assertEquals(2, solution.climbStairs(2));
		assertEquals(3, solution.climbStairs(3));
		assertEquals(5, solution.climbStairs(4));
		assertEquals(8, solution.climbStairs(5));
	}

}

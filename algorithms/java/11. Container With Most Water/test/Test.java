import static org.junit.Assert.*;

/**
 * 11. Container With Most Water
 * 
 * @author leo.ch
 * @since  2017-03-08
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(20, solution.maxArea(new int[]{20, 20}));
		assertEquals(2, solution.maxArea(new int[]{1, 20, 2}));
		assertEquals(20, solution.maxArea(new int[]{2, 5, 5, 3, 4, 10, 2}));
	}

}

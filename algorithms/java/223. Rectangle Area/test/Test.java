import static org.junit.Assert.*;

/**
 * 223. Rectangle Area
 * 
 * @author leo.ch
 * @since  2017-03-20
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(45, solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
		assertEquals(24, solution.computeArea(-3, -1, 3, 0, 0, 2, 9, 4));
		assertEquals(30, solution.computeArea(-3, 0, 0, 4, 3, -1, 9, 2));
	}

}

import static org.junit.Assert.*;

/**
 * 62. Unique Paths
 * 
 * @author leo.ch
 * @since  2017-02-21
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(1, solution.uniquePaths(1, 1));
		assertEquals(28, solution.uniquePaths(3, 7));
		assertEquals(35, solution.uniquePaths(4, 5));
		assertEquals(84, solution.uniquePaths(4, 7));
	}

}

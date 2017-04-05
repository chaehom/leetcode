import static org.junit.Assert.*;

/**
 * 463. Island Perimeter
 * 
 * @author leo.ch
 * @since  2017-04-05
 */
public class Test {

	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		int[][] grid = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
		assertEquals(16, solution.islandPerimeter(grid));
	}

	@org.junit.Test
	public void test2() {
		Solution solution = new Solution();
		int[][] grid = {{0,0,0}, {0,1,0}, {0,0,0}};
		assertEquals(4, solution.islandPerimeter(grid));
	}

	@org.junit.Test
	public void test3() {
		Solution solution = new Solution();
		int[][] grid = {{0,0,0}, {0,0,0}, {0,0,0}};
		assertEquals(0, solution.islandPerimeter(grid));
	}

	@org.junit.Test
	public void test4() {
		Solution solution = new Solution();
		int[][] grid = {{1,1,1}, {1,1,1}, {1,1,1}};
		assertEquals(12, solution.islandPerimeter(grid));
	}

	@org.junit.Test
	public void test5() {
		Solution solution = new Solution();
		int[][] grid = {{1,1,1}, {0,0,0}, {1,1,0}, {0,0,0}};
		assertEquals(14, solution.islandPerimeter(grid));
	}
}

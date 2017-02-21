import static org.junit.Assert.*;

/**
 * 63. Unique Paths II
 * 
 * @author leo.ch
 * @since  2017-02-21
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1()
	{
		int[][] obstacleGrid = {{0}};
		assertEquals(1, solution.uniquePathsWithObstacles(obstacleGrid));
	}

	@org.junit.Test
	public void test2()
	{
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		assertEquals(2, solution.uniquePathsWithObstacles(obstacleGrid));
	}

	@org.junit.Test
	public void test3()
	{
		int[][] obstacleGrid = {
			{0,0,1,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0},
			{1,0,0,1,0,0,1},
			{0,0,0,0,0,0,0},
			{0,0,1,0,0,0,0}
		};
		assertEquals(56, solution.uniquePathsWithObstacles(obstacleGrid));
	}

}

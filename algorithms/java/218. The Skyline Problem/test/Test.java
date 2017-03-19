import static org.junit.Assert.assertArrayEquals;

import java.util.List;

/**
 * 218. The Skyline Problem
 * 
 * @author leo.ch
 * @since  2017-03-19
 */
public class Test {

	/**
	 * 题目用例
	 */
	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
		int[][] expecteds = {{2, 10}, {3, 15}, {7, 12}, {12, 0}, {15, 10}, {20, 8}, {24, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 两栋不重合的楼
	 */
	@org.junit.Test
	public void test2() {
		Solution solution = new Solution();
		int[][] buildings = {{1, 5, 10}, {8, 10, 2}};
		int[][] expecteds = {{1, 10}, {5, 0}, {8, 2}, {10, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 两栋重叠的楼，前高后低
	 */
	@org.junit.Test
	public void test3() {
		Solution solution = new Solution();
		int[][] buildings = {{1, 5, 10}, {2, 10, 2}};
		int[][] expecteds = {{1, 10}, {5, 2}, {10, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 两栋重叠的楼，前低后高
	 */
	@org.junit.Test
	public void test4() {
		Solution solution = new Solution();
		int[][] buildings = {{1, 5, 2}, {2, 10, 10}};
		int[][] expecteds = {{1, 2}, {2, 10}, {10, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 三栋重叠的楼，高度依次下降
	 */
	@org.junit.Test
	public void test5() {
		Solution solution = new Solution();
		int[][] buildings = {{1, 5, 10}, {3, 11, 8}, {7, 15, 4}};
		int[][] expecteds = {{1, 10}, {5, 8}, {11, 4}, {15, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 三栋重叠的楼，高度依次上升
	 */
	@org.junit.Test
	public void test6() {
		Solution solution = new Solution();
		int[][] buildings = {{1, 5, 4}, {3, 11, 8}, {7, 15, 10}};
		int[][] expecteds = {{1, 4}, {3, 8}, {7, 10}, {15, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 三栋重叠的楼，中间被覆盖
	 */
	@org.junit.Test
	public void test7() {
		Solution solution = new Solution();
		int[][] buildings = {{1, 6, 8}, {2, 8, 5}, {3, 10, 7}};
		int[][] expecteds = {{1, 8}, {6, 7}, {10, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 三栋重叠的楼，前后两栋不连续，中间较低
	 */
	@org.junit.Test
	public void test8() {
		Solution solution = new Solution();
		int[][] buildings = {{2, 5, 3}, {4, 8, 2}, {7, 10, 4}};
		int[][] expecteds = {{2, 3}, {5, 2}, {7, 4}, {10, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 三栋重叠的楼，前后两栋不连续，中间较高
	 */
	@org.junit.Test
	public void test9() {
		Solution solution = new Solution();
		int[][] buildings = {{2, 5, 3}, {4, 8, 6}, {7, 10, 4}};
		int[][] expecteds = {{2, 3}, {4, 6}, {8, 4}, {10, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}

	/**
	 * 两栋重叠的楼，完全重叠
	 */
	@org.junit.Test
	public void test10() {
		Solution solution = new Solution();
		int[][] buildings = {{2, 5, 3}, {2, 5, 3}};
		int[][] expecteds = {{2, 3}, {5, 0}};
		
		List<int[]> answer = solution.getSkyline(buildings);
		int[][] actuals = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++)
		{
			actuals[i] = answer.get(i);
		}
		assertArrayEquals(expecteds, actuals);
	}
}

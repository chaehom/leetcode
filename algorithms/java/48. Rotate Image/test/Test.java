import static org.junit.Assert.*;

/**
 * 48. Rotate Image
 * 
 * @author leo.ch
 * @since  2017-03-09
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		int[][] expecteds = {
			{7, 4, 1},
			{8, 5, 2},
			{9, 6, 3}
		};
		
		solution.rotate(matrix);
		assertArrayEquals(expecteds, matrix);
	}

	@org.junit.Test
	public void test2() {
		int[][] matrix = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
		
		int[][] expecteds = {
			{13, 9, 5, 1},
			{14, 10, 6, 2},
			{15, 11, 7, 3},
			{16, 12, 8, 4},
		};
		
		solution.rotate(matrix);
		assertArrayEquals(expecteds, matrix);
	}
	@org.junit.Test
	public void test3() {
		int[][] matrix = {
			{1}
		};
		
		int[][] expecteds = {
			{1}
		};
		
		solution.rotate(matrix);
		assertArrayEquals(expecteds, matrix);
	}
}

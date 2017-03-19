import static org.junit.Assert.*;

/**
 * 221. Maximal Square
 * 
 * @author leo.ch
 * @since  2017-03-19
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		char[][] matrix = {
			{'1', '0', '1', '0', '0'},
			{'1', '0', '1', '1', '1'},
			{'1', '1', '1', '1', '1'},
			{'1', '0', '0', '1', '0'}};
		assertEquals(4, solution.maximalSquare(matrix));
	}
	
	@org.junit.Test
	public void test2() {
		char[][] matrix = {
			{'1', '1', '1', '0', '0'},
			{'1', '0', '1', '1', '1'},
			{'1', '1', '1', '1', '1'},
			{'0', '1', '1', '1', '1'},
			{'1', '0', '0', '1', '0'}};
		assertEquals(9, solution.maximalSquare(matrix));
	}

	@org.junit.Test
	public void test3() {
		char[][] matrix = {{'1'}};
		assertEquals(1, solution.maximalSquare(matrix));
	}

	@org.junit.Test
	public void test4() {
		char[][] matrix = {{'0'}};
		assertEquals(0, solution.maximalSquare(matrix));
	}

	@org.junit.Test
	public void test5() {
		char[][] matrix = {	{'0', '1'},
							{'1', '1'}	};
		assertEquals(1, solution.maximalSquare(matrix));
	}

	@org.junit.Test
	public void test6() {
		char[][] matrix = null;
		assertEquals(0, solution.maximalSquare(matrix));
	}
	
	@org.junit.Test
	public void test7() {
		char[][] matrix = {
				{'0','0','0','1'},
				{'1','1','0','1'},
				{'1','1','1','1'},
				{'0','1','1','1'},
				{'0','1','1','1'}};
		assertEquals(9, solution.maximalSquare(matrix));
	}
}

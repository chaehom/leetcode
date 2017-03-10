import static org.junit.Assert.*;

/**
 * 79. Word Search
 * 
 * @author leo.ch
 * @since  2017-03-10
 */
public class Test {

	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		char[][] board = {
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}
		};
		assertTrue(solution.exist(board, "ABCCED"));
		assertTrue(solution.exist(board, "SEE"));
		assertFalse(solution.exist(board, "ABCB"));
	}
	
	@org.junit.Test
	public void test2() {
		Solution solution = new Solution();
		char[][] board = {
			{'C','A','A'},
			{'A','A','A'},
			{'B','C','D'}
		};
		assertTrue(solution.exist(board, "AAB"));
	}
	
	@org.junit.Test
	public void test3() {
		Solution solution = new Solution();
		char[][] board = {
				{'A','B','C','E'},
				{'S','F','E','S'},
				{'A','D','E','E'}
		};
		assertTrue(solution.exist(board, "ABCESEEEFS"));
	}
	
	
}

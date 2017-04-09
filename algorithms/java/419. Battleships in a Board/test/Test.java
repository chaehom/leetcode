import static org.junit.Assert.*;

/**
 * 419. Battleships in a Board
 * 
 * @author leo.ch
 * @since  2017-04-09
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		assertEquals(2, solution.countBattleships(board));
	}

	@org.junit.Test
	public void test2() {
		char[][] board = {{'X','.','.','.'},{'.','X','X','X'},{'X','.','.','.'}};
		assertEquals(3, solution.countBattleships(board));
	}
	
	@org.junit.Test
	public void test3() {
		char[][] board = {{'X','X','X','X'},{'.','.','.','.'},{'.','.','.','.'}};
		assertEquals(1, solution.countBattleships(board));
	}
}

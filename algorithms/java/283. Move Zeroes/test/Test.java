import static org.junit.Assert.assertArrayEquals;

/**
 * 283. Move Zeroes
 * 
 * @author leo.ch
 * @since  2017-03-13
 */
public class Test {

	Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[] expecteds = {1, 2, 3, 1, 2, 5, 1, 3, 2, 0, 0, 0};
		int[] actuals = {1, 0, 2, 3, 0, 1, 2, 5, 1, 3, 0, 2};
		
		solution.moveZeroes(actuals);
		
		assertArrayEquals(expecteds, actuals);
	}

	@org.junit.Test
	public void test2() {
		int[] expecteds = {1, 3, 12, 0, 0};
		int[] actuals = {0, 1, 0, 3, 12};
		
		solution.moveZeroes(actuals);
		
		assertArrayEquals(expecteds, actuals);
	}
}

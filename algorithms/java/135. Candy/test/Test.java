import static org.junit.Assert.*;

/**
 * 135. Candy
 * 
 * @author leo.ch
 * @since  2017-03-05
 */
public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		int[] ratings = {5, 6, 2, 2, 4, 8, 9, 5, 4, 0, 5, 1};
		assertEquals(23, solution.candy(ratings));
	}

	@org.junit.Test
	public void test2() {
		int[] ratings = {1};
		assertEquals(1, solution.candy(ratings));
	}

	@org.junit.Test
	public void test3() {
		int[] ratings = {1, 5, 2};
		assertEquals(4, solution.candy(ratings));
	}

}

import static org.junit.Assert.*;

/**
 * 66. Plus One
 * 
 * @author leo.ch
 * @since  2017-02-19
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertArrayEquals(new int[]{2, 0}, solution.plusOne(new int[]{1, 9}));
		assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
		assertArrayEquals(new int[]{1}, solution.plusOne(new int[]{0}));
		assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
	}

}

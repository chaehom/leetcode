import static org.junit.Assert.*;

/**
 * 492. Construct the Rectangle
 * 
 * @author leo.ch
 * @since  2017-04-13
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertArrayEquals(new int[]{2, 2}, solution.constructRectangle(4));
		assertArrayEquals(new int[]{10, 10}, solution.constructRectangle(100));
		assertArrayEquals(new int[]{1, 1}, solution.constructRectangle(1));
		assertArrayEquals(new int[]{7, 1}, solution.constructRectangle(7));
		assertArrayEquals(new int[]{4, 2}, solution.constructRectangle(8));
		assertArrayEquals(new int[]{5, 4}, solution.constructRectangle(20));
	}

}

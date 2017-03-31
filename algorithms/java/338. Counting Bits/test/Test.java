import static org.junit.Assert.*;

/**
 * 338. Counting Bits
 * 
 * @author leo.ch
 * @since  2017-03-31
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertArrayEquals(new int[]{0,1,1,2,1,2}, solution.countBits(5));
		assertArrayEquals(new int[]{0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1}, solution.countBits(16));
	}

}

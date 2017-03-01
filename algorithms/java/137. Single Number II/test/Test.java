import static org.junit.Assert.*;

/**
 * 137. Single Number II
 * 
 * @author leo.ch
 * @since  2017-03-01
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(4, solution.singleNumber(new int[]{1, 1, 2, 1, 2, 3, 2, 3, 3, 4, 5, 5, 5}));
		assertEquals(1, solution.singleNumber(new int[]{1}));
	}

}

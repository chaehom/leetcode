import static org.junit.Assert.*;

/**
 * 169. Majority Element
 * 
 * @author leo.ch
 * @since  2017-03-06
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(1, solution.majorityElement(new int[]{1, 2, 1, 3, 2, 1, 1, 1, 2}));
		assertEquals(2, solution.majorityElement(new int[]{1, 2, 2, 2, 3, 2, 2, 1}));
		assertEquals(2, solution.majorityElement(new int[]{1, 2, 2, 3}));
	}

}

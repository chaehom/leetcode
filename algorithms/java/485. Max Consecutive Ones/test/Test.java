import static org.junit.Assert.*;

/**
 * 485. Max Consecutive Ones
 * 
 * @author leo.ch
 * @since  2017-03-13
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(3, solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
		assertEquals(1, solution.findMaxConsecutiveOnes(new int[]{1, 0}));
		assertEquals(0, solution.findMaxConsecutiveOnes(new int[]{0, 0}));
	}

}

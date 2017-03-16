import static org.junit.Assert.*;

/**
 * 217. Contains Duplicate
 * 
 * @author leo.ch
 * @since  2017-03-16
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.containsDuplicate(new int[]{1, 1, 2, 3, 4, 5}));
		assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4, 5}));
		assertFalse(solution.containsDuplicate(new int[]{}));
	}

}

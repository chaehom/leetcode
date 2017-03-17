import static org.junit.Assert.*;

/**
 * 219. Contains Duplicate II
 * 
 * @author leo.ch
 * @since  2017-03-17
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.containsNearbyDuplicate(new int[]{99, 99}, 2));
		assertTrue(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 4, 5}, 3));
		assertTrue(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 4, 5}, 4));
		assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 4, 5}, 2));
		assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5, 6}, 3));
	}

}

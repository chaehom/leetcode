import static org.junit.Assert.*;

/**
 * 220. Contains Duplicate III
 * 
 * @author leo.ch
 * @since  2017-03-17
 */
public class Test {

	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		assertFalse(solution.containsNearbyAlmostDuplicate(new int[]{-1, 2147483647}, 1, 2147483647));
		assertTrue(solution.containsNearbyAlmostDuplicate(new int[]{2, 2}, 3, 0));
		assertTrue(solution.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 4, 5}, 2, 2));
		assertTrue(solution.containsNearbyAlmostDuplicate(new int[]{1, 4, 9, 16, 25}, 1, 3));
		assertTrue(solution.containsNearbyAlmostDuplicate(new int[]{9, 16, 25, 1, 4}, 1, 3));
		assertFalse(solution.containsNearbyAlmostDuplicate(new int[]{9, 16, 1, 25, 4}, 1, 3));
		assertFalse(solution.containsNearbyAlmostDuplicate(new int[]{1, 25, 9, 16, 4, 36}, 3, 3));
		assertFalse(solution.containsNearbyAlmostDuplicate(new int[]{1, 11, 111, 1111, 11111}, 1, 3));
	}

}

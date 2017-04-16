import static org.junit.Assert.*;

/**
 * 506. Relative Ranks
 * 
 * @author leo.ch
 * @since  2017-04-16
 */
public class Test {

	Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		int[] nums = {5, 4, 3, 2, 1};
		String[] expecteds = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
		assertArrayEquals(expecteds, solution.findRelativeRanks(nums));
	}

	@org.junit.Test
	public void test2() {
		Solution solution = new Solution();
		int[] nums = {1, 4, 3, 2, 5};
		String[] expecteds = {"5", "Silver Medal", "Bronze Medal", "4", "Gold Medal"};
		assertArrayEquals(expecteds, solution.findRelativeRanks(nums));
	}

}

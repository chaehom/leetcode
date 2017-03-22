import static org.junit.Assert.*;

import java.util.List;

/**
 * 228. Summary Ranges
 * 
 * @author leo.ch
 * @since  2017-03-22
 */
public class Test {

	private Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		int[] nums = {0,1,2,4,5,7};
		List<String> result = solution.summaryRanges(nums);
		String[] actuals = result.toArray(new String[result.size()]);
		String[] expecteds = {"0->2", "4->5", "7"};
		assertArrayEquals(expecteds, actuals);
	}

	@org.junit.Test
	public void test2() {
		int[] nums = {0};
		List<String> result = solution.summaryRanges(nums);
		String[] actuals = result.toArray(new String[result.size()]);
		String[] expecteds = {"0"};
		assertArrayEquals(expecteds, actuals);
	}

	@org.junit.Test
	public void test3() {
		int[] nums = {0, 1, 2, 3, 4};
		List<String> result = solution.summaryRanges(nums);
		String[] actuals = result.toArray(new String[result.size()]);
		String[] expecteds = {"0->4"};
		assertArrayEquals(expecteds, actuals);
	}

	@org.junit.Test
	public void test4() {
		int[] nums = {};
		List<String> result = solution.summaryRanges(nums);
		String[] actuals = result.toArray(new String[result.size()]);
		String[] expecteds = {};
		assertArrayEquals(expecteds, actuals);
	}

}

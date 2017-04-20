import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * 
 * @author leo.ch
 * @since  2017-04-20
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		List<Integer> expected = Arrays.asList(5, 6);
		List<Integer> actuals = solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
		assertTrue(expected.size() == actuals.size());
		Iterator<Integer> iter = actuals.iterator();
		while (iter.hasNext())
		{
			assertTrue(expected.contains(iter.next()));
		}
		assertTrue(expected.equals(actuals));
	}

}

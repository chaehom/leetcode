import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

/**
 * 17. Letter Combinations of a Phone Number
 * 
 * @author leo.ch
 * @since  2017-02-11
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(3, solution.letterCombinations("3").size());
		assertEquals(9, solution.letterCombinations("23").size());
		assertEquals(27, solution.letterCombinations("234").size());
		assertEquals(36, solution.letterCombinations("239").size());
		assertEquals(new ArrayList<String>(), solution.letterCombinations(""));
	}

}

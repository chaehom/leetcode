import static org.junit.Assert.*;

import java.util.List;

/**
 * 49. Group Anagrams
 * 
 * @author leo.ch
 * @since  2017-02-18
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1()
	{
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		String[][] expected = {
			{"ate", "eat","tea"},
			{"bat"},
			{"nat","tan"}
		};
		
		List<List<String>> actuals = solution.groupAnagrams(strs);
		int i = 0;
		for (List<String> str : actuals)
		{
			assertArrayEquals(expected[i++], str.toArray());
		}
	}

}

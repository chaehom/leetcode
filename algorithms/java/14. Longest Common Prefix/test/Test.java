import static org.junit.Assert.*;

/**
 * 14. Longest Common Prefix
 * 
 * @author leo.ch
 * @since  2017-02-09
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() 
	{
		String[] strs = {
			"abcdefghij",
			"abcdffff",
			"abcdef",
			"abcd",
			"abcddd",
			"abc"
		};
		assertEquals("abc", solution.longestCommonPrefix(strs));
	}

	@org.junit.Test
	public void test2() 
	{
		String[] strs = {"abc"};
		assertEquals("abc", solution.longestCommonPrefix(strs));
	}


	@org.junit.Test
	public void test3() 
	{
		String[] strs = {"", "abcdef"};
		assertEquals("", solution.longestCommonPrefix(strs));
	}

	@org.junit.Test
	public void test4() 
	{
		String[] strs = {"abc", ""};
		assertEquals("", solution.longestCommonPrefix(strs));
	}

	@org.junit.Test
	public void test5() 
	{
		String[] strs = {""};
		assertEquals("", solution.longestCommonPrefix(strs));
	}

	@org.junit.Test
	public void test6() 
	{
		String[] strs = {};
		assertEquals("", solution.longestCommonPrefix(strs));
	}
}

import static org.junit.Assert.*;

/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * @author leo.ch
 * @since  2017-02-06
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
	}

	@org.junit.Test
	public void test2() {
		assertEquals(1, solution.lengthOfLongestSubstring("bbbbbb"));
	}

	@org.junit.Test
	public void test3() {
		assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
	}

	@org.junit.Test
	public void test4() {
		assertEquals(26, solution.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzabbc"));
	}

	@org.junit.Test
	public void test5() {
		assertEquals(0, solution.lengthOfLongestSubstring(""));
	}

	@org.junit.Test
	public void test6() {
		assertEquals(1, solution.lengthOfLongestSubstring("a"));
	}

	@org.junit.Test
	public void test7() {
		assertEquals(2, solution.lengthOfLongestSubstring("ab"));
	}

	@org.junit.Test
	public void test8() {
		assertEquals(3, solution.lengthOfLongestSubstring("abc"));
	}

	@org.junit.Test
	public void test9() {
		assertEquals(2, solution.lengthOfLongestSubstring("aaab"));
	}

}

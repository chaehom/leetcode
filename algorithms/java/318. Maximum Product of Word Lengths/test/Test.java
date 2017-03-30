import static org.junit.Assert.*;

/**
 * 318. Maximum Product of Word Lengths
 * 
 * @author leo.ch
 * @since  2017-03-30
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(16, solution.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
		assertEquals(4, solution.maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
		assertEquals(0, solution.maxProduct(new String[]{"a", "aa", "aaa", "aaaa"}));
	}

}

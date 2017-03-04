import static org.junit.Assert.*;

/**
 * 28. Implement strStr()
 * 
 * @author leo.ch
 * @since  2017-03-04
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(0, solution.strStr("", ""));
		assertEquals(-1, solution.strStr("abcdefg", "h"));
		assertEquals(3, solution.strStr("abcdefg", "def"));
		assertEquals(-1, solution.strStr("", "def"));
		assertEquals(0, solution.strStr("abc", ""));
	}

}

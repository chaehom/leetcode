import static org.junit.Assert.*;

/**
 * 344. Reverse String
 * 
 * @author leo.ch
 * @since  2017-04-01
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("olleh", solution.reverseString("hello"));
		assertEquals("", solution.reverseString(""));
		assertEquals("a", solution.reverseString("a"));
		assertEquals("ab", solution.reverseString("ba"));
	}

}

import static org.junit.Assert.*;

/**
 * 91. Decode Ways
 * 
 * @author leo.ch
 * @since  2017-02-23
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(0, solution.numDecodings(""));
		assertEquals(2, solution.numDecodings("12"));
		assertEquals(3, solution.numDecodings("123"));
		assertEquals(3, solution.numDecodings("1234"));
		assertEquals(1, solution.numDecodings("9999999"));
		assertEquals(2, solution.numDecodings("2333333"));
		assertEquals(5, solution.numDecodings("1111"));
		assertEquals(3, solution.numDecodings("1234"));
		assertEquals(0, solution.numDecodings("0"));
		assertEquals(1, solution.numDecodings("10"));
	}

}

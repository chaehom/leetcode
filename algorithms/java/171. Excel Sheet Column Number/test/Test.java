import static org.junit.Assert.*;

/**
 * 171. Excel Sheet Column Number
 * 
 * @author leo.ch
 * @since  2017-03-07
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(1, solution.titleToNumber("A"));
		assertEquals(26, solution.titleToNumber("Z"));
		assertEquals(27, solution.titleToNumber("AA"));
		assertEquals(52, solution.titleToNumber("AZ"));
		assertEquals(702, solution.titleToNumber("ZZ"));
		assertEquals(703, solution.titleToNumber("AAA"));
	}

}

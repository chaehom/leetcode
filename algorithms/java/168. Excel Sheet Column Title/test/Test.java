import static org.junit.Assert.*;

/**
 * 168. Excel Sheet Column Title
 * 
 * @author leo.ch
 * @since  2017-03-06
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("A", solution.convertToTitle(1));
		assertEquals("Z", solution.convertToTitle(26));
		assertEquals("AA", solution.convertToTitle(27));
		assertEquals("AB", solution.convertToTitle(28));
		assertEquals("AZ", solution.convertToTitle(52));
		assertEquals("ZZ", solution.convertToTitle(702));
		assertEquals("AAA", solution.convertToTitle(703));
	}

}

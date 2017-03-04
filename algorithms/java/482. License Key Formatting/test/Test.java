import static org.junit.Assert.*;

/**
 * 482. License Key Formatting
 * 
 * @author leo.ch
 * @since  2017-03-04
 */
public class Test {
	
	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("24A0-R74K", solution.licenseKeyFormatting("2-4A0r7-4k", 4));
		assertEquals("24-A0R-74K", solution.licenseKeyFormatting("2-4A0r7-4k", 3));
		assertEquals("CH", solution.licenseKeyFormatting("C-H", 3));
	}

}

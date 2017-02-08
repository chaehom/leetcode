import static org.junit.Assert.*;

/**
 * 13. Roman to Integer
 * 
 * @author leo.ch
 * @since  2017-02-08
 */
public class Test {

	private Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		assertEquals(1, solution.romanToInt("I"));
		assertEquals(2, solution.romanToInt("II"));
		assertEquals(3, solution.romanToInt("III"));
		assertEquals(4, solution.romanToInt("IV"));
		assertEquals(5, solution.romanToInt("V"));
		assertEquals(6, solution.romanToInt("VI"));
		assertEquals(7, solution.romanToInt("VII"));
		assertEquals(8, solution.romanToInt("VIII"));
		assertEquals(9, solution.romanToInt("IX"));
	}

	@org.junit.Test
	public void test2() {
		assertEquals(10, solution.romanToInt("X"));
		assertEquals(20, solution.romanToInt("XX"));
		assertEquals(30, solution.romanToInt("XXX"));
		assertEquals(40, solution.romanToInt("XL"));
		assertEquals(50, solution.romanToInt("L"));
		assertEquals(60, solution.romanToInt("LX"));
		assertEquals(70, solution.romanToInt("LXX"));
		assertEquals(80, solution.romanToInt("LXXX"));
		assertEquals(11, solution.romanToInt("XI"));
		assertEquals(34, solution.romanToInt("XXXIV"));
		assertEquals(56, solution.romanToInt("LVI"));
		assertEquals(90, solution.romanToInt("XC"));
		assertEquals(91, solution.romanToInt("XCI"));
	}

	@org.junit.Test
	public void test3() {
		assertEquals(100, solution.romanToInt("C"));
		assertEquals(200, solution.romanToInt("CC"));
		assertEquals(300, solution.romanToInt("CCC"));
		assertEquals(400, solution.romanToInt("CD"));
		assertEquals(500, solution.romanToInt("D"));
		assertEquals(600, solution.romanToInt("DC"));
		assertEquals(700, solution.romanToInt("DCC"));
		assertEquals(800, solution.romanToInt("DCCC"));
		assertEquals(900, solution.romanToInt("CM"));
		assertEquals(101, solution.romanToInt("CI"));
		assertEquals(111, solution.romanToInt("CXI"));
		assertEquals(360, solution.romanToInt("CCCLX"));
		assertEquals(499, solution.romanToInt("CDXCIX"));
		assertEquals(999, solution.romanToInt("CMXCIX"));
	}
	@org.junit.Test
	public void test4() {
		assertEquals(1000, solution.romanToInt("M"));
		assertEquals(2000, solution.romanToInt("MM"));
		assertEquals(3000, solution.romanToInt("MMM"));
		assertEquals(1001, solution.romanToInt("MI"));
		assertEquals(2700, solution.romanToInt("MMDCC"));
		assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
	}


}

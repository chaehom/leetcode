import static org.junit.Assert.*;

/**
 * 12. Integer to Roman
 * 
 * @author leo.ch
 * @since  2017-02-08
 */
public class Test {

	private Solution solution = new Solution();

	@org.junit.Test
	public void test1() 
	{
		assertTrue("I".equals(solution.intToRoman(1)));
		assertTrue("II".equals(solution.intToRoman(2)));
		assertTrue("III".equals(solution.intToRoman(3)));
		assertTrue("IV".equals(solution.intToRoman(4)));
		assertTrue("V".equals(solution.intToRoman(5)));
		assertTrue("VI".equals(solution.intToRoman(6)));
		assertTrue("VII".equals(solution.intToRoman(7)));
		assertTrue("VIII".equals(solution.intToRoman(8)));
		assertTrue("IX".equals(solution.intToRoman(9)));
	}
	
	@org.junit.Test
	public void test2() 
	{
		assertTrue("X".equals(solution.intToRoman(10)));
		assertTrue("XX".equals(solution.intToRoman(20)));
		assertTrue("XXX".equals(solution.intToRoman(30)));
		assertTrue("XL".equals(solution.intToRoman(40)));
		assertTrue("L".equals(solution.intToRoman(50)));
		assertTrue("LX".equals(solution.intToRoman(60)));
		assertTrue("LXX".equals(solution.intToRoman(70)));
		assertTrue("LXXX".equals(solution.intToRoman(80)));
		assertTrue("XC".equals(solution.intToRoman(90)));
		assertTrue("XI".equals(solution.intToRoman(11)));
		assertTrue("XXXIV".equals(solution.intToRoman(34)));
		assertTrue("XXXV".equals(solution.intToRoman(35)));
		assertTrue("LI".equals(solution.intToRoman(51)));
		assertTrue("LVI".equals(solution.intToRoman(56)));
		assertTrue("XCIX".equals(solution.intToRoman(99)));
	}
	
	@org.junit.Test
	public void test3() 
	{
		assertTrue("C".equals(solution.intToRoman(100)));
		assertTrue("CC".equals(solution.intToRoman(200)));
		assertTrue("CCC".equals(solution.intToRoman(300)));
		assertTrue("CD".equals(solution.intToRoman(400)));
		assertTrue("D".equals(solution.intToRoman(500)));
		assertTrue("DC".equals(solution.intToRoman(600)));
		assertTrue("DCC".equals(solution.intToRoman(700)));
		assertTrue("DCCC".equals(solution.intToRoman(800)));
		assertTrue("CM".equals(solution.intToRoman(900)));
		assertTrue("CI".equals(solution.intToRoman(101)));
		assertTrue("CXI".equals(solution.intToRoman(111)));
		assertTrue("CCCLX".equals(solution.intToRoman(360)));
		assertTrue("CDXCIX".equals(solution.intToRoman(499)));
		assertTrue("CMXCIX".equals(solution.intToRoman(999)));
	}
	
	@org.junit.Test
	public void test4() 
	{
		assertTrue("M".equals(solution.intToRoman(1000)));
		assertTrue("MM".equals(solution.intToRoman(2000)));
		assertTrue("MMM".equals(solution.intToRoman(3000)));
		assertTrue("MI".equals(solution.intToRoman(1001)));
		assertTrue("MMDCC".equals(solution.intToRoman(2700)));
		assertTrue("MMMCMXCIX".equals(solution.intToRoman(3999)));
	}

}

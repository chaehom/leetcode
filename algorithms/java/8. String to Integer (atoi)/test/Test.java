import static org.junit.Assert.*;

/**
 * 8. String to Integer (atoi)
 * 
 * @author leo.ch
 * @since  2017-02-07
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		assertEquals(1234, solution.myAtoi("1234"));
	}

	@org.junit.Test
	public void test2() {
		assertEquals(-1234, solution.myAtoi("-1234"));
	}

	@org.junit.Test
	public void test3() {
		assertEquals(0, solution.myAtoi("0"));
	}

	@org.junit.Test
	public void test4() {
		assertEquals(-1234, solution.myAtoi("  -1234"));
	}

	@org.junit.Test
	public void test5() {
		assertEquals(1234, solution.myAtoi("+1234   "));
	}

	@org.junit.Test
	public void test6() {
		assertEquals(1234, solution.myAtoi("  1234   "));
	}

	@org.junit.Test
	public void test7() {
		assertEquals(0, solution.myAtoi("abcd123"));
	}

	@org.junit.Test
	public void test8() {
		assertEquals(123, solution.myAtoi("123abc"));
	}

	@org.junit.Test
	public void test9() {
		assertEquals(0, solution.myAtoi(""));
		assertEquals(0, solution.myAtoi("   "));
	}

	@org.junit.Test
	public void test10() {
		assertEquals(Integer.MAX_VALUE, solution.myAtoi("12345678901234567"));
	}

	@org.junit.Test
	public void test11() {
		assertEquals(Integer.MIN_VALUE, solution.myAtoi("-12345678901234567"));
	}
	
	@org.junit.Test
	public void test12() {
		assertEquals(Integer.MAX_VALUE, solution.myAtoi("2147483648"));
	}
	
	@org.junit.Test
	public void test13() {
		assertEquals(Integer.MIN_VALUE, solution.myAtoi("-2147483648"));
	}
}

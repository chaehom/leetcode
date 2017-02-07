import static org.junit.Assert.*;

/**
 * 7. Reverse Integer
 * 
 * @author leo.ch
 * @since  2017-02-07
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		assertEquals(123, solution.reverse(321));
	}

	@org.junit.Test
	public void test2() {
		assertEquals(-123, solution.reverse(-321));
	}

	@org.junit.Test
	public void test3() {
		assertEquals(91, solution.reverse(19000));
	}

	@org.junit.Test
	public void test4() {
		assertEquals(0, solution.reverse(Integer.MAX_VALUE));
	}
	
	@org.junit.Test
	public void test5() {
		assertEquals(0, solution.reverse(Integer.MIN_VALUE));
	}
	
	@org.junit.Test
	public void test6() {
		assertEquals(0, solution.reverse(-0));
	}

	@org.junit.Test
	public void test7() {
		assertEquals(0, solution.reverse(1000000003));
	}
}

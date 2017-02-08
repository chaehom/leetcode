import static org.junit.Assert.*;

/**
 * 9. Palindrome Number
 * 
 * @author leo.ch
 * @since  2017-02-08
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		assertTrue(solution.isPalindrome(1221));
	}

	@org.junit.Test
	public void test2() {
		assertTrue(solution.isPalindrome(121));
	}

	@org.junit.Test
	public void test3() {
		assertFalse(solution.isPalindrome(1211));
	}

	@org.junit.Test
	public void test4() {
		assertTrue(solution.isPalindrome(0));
	}

	@org.junit.Test
	public void test5() {
		assertFalse(solution.isPalindrome(1110));
	}

	@org.junit.Test
	public void test6() {
		assertFalse(solution.isPalindrome(2147483647));
	}

	@org.junit.Test
	public void test7() {
		assertFalse(solution.isPalindrome(-121));
	}

}

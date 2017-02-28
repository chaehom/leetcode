import static org.junit.Assert.*;

/**
 * 125. Valid Palindrome
 * 
 * @author leo.ch
 * @since  2017-02-28
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(solution.isPalindrome("race a car"));
		assertTrue(solution.isPalindrome(""));
		assertTrue(solution.isPalindrome(".,"));
		assertTrue(solution.isPalindrome("."));
		assertFalse(solution.isPalindrome("abaab"));
		assertFalse(solution.isPalindrome("ab"));
		assertFalse(solution.isPalindrome("abc,cba,ada,dda,abc,cba"));
	}

}

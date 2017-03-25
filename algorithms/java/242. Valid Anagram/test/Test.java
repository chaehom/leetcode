import static org.junit.Assert.*;

/**
 * 242. Valid Anagram
 * 
 * @author leo.ch
 * @since  2017-03-25
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.isAnagram("", ""));
		assertTrue(solution.isAnagram("aaabb", "ababa"));
		assertTrue(solution.isAnagram("anagram", "nagaram"));
		assertFalse(solution.isAnagram("aaa", ""));
		assertFalse(solution.isAnagram("car", "rat"));
	}

}

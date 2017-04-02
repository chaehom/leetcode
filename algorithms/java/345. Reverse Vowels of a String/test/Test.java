import static org.junit.Assert.*;

/**
 * 345. Reverse Vowels of a String
 * 
 * @author leo.ch
 * @since  2017-04-02
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("", solution.reverseVowels(""));
		assertEquals("OE", solution.reverseVowels("EO"));
		assertEquals("abc", solution.reverseVowels("abc"));
		assertEquals("aeiou", solution.reverseVowels("uoiea"));
		assertEquals("holle", solution.reverseVowels("hello"));
		assertEquals("leotcede", solution.reverseVowels("leetcode"));
	}

}

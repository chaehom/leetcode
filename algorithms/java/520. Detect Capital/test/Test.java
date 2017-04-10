import static org.junit.Assert.*;

/**
 * 520. Detect Capital
 * 
 * @author leo.ch
 * @since  2017-04-10
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.detectCapitalUse("CHINA"));
		assertTrue(solution.detectCapitalUse("Java"));
		assertTrue(solution.detectCapitalUse("hello"));
		assertFalse(solution.detectCapitalUse("SpringToolSuit"));
		assertFalse(solution.detectCapitalUse(""));
	}

}

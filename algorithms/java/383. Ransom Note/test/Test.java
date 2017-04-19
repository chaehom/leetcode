import static org.junit.Assert.*;

/**
 * 383. Ransom Note
 * 
 * @author leo.ch
 * @since  2017-04-19
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.canConstruct("", ""));
		assertFalse(solution.canConstruct("a", ""));
		assertTrue(solution.canConstruct("", "a"));
		assertFalse(solution.canConstruct("a", "b"));
		assertFalse(solution.canConstruct("aa", "ab"));
		assertTrue(solution.canConstruct("aa", "aab"));
	}

}

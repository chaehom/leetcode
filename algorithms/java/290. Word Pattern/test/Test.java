import static org.junit.Assert.*;

/**
 * 290. Word Pattern
 * 
 * @author leo.ch
 * @since  2017-03-28
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
		assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
		assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
		assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
	}

}

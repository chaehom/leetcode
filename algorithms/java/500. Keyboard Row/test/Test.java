import static org.junit.Assert.*;

/**
 * 500. Keyboard Row
 * 
 * @author leo.ch
 * @since  2017-04-11
 */
public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		String[] expecteds = {"Alaska", "Dad"};
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		assertArrayEquals(expecteds, solution.findWords(words));
	}

	@org.junit.Test
	public void test2() {
		String[] expecteds = {};
		String[] words = {"Hello", "Peace"};
		assertArrayEquals(expecteds, solution.findWords(words));
	}
	
	@org.junit.Test
	public void test3() {
		String[] expecteds = {};
		String[] words = {};
		assertArrayEquals(expecteds, solution.findWords(words));
	}
}

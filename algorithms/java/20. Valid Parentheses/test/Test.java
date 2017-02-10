import static org.junit.Assert.*;

/**
 * 20. Valid Parentheses
 * 
 * @author leo.ch
 * @since  2017-02-10
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test() {
		assertTrue(solution.isValid("()"));
		assertTrue(solution.isValid("([])"));
		assertTrue(solution.isValid("({[]})"));
		assertFalse(solution.isValid("([)"));
		assertTrue(solution.isValid("()[]"));
		assertTrue(solution.isValid("()[[[]]]"));
		assertFalse(solution.isValid("{()[}]"));
		assertFalse(solution.isValid("]][["));
		assertFalse(solution.isValid("["));
		assertFalse(solution.isValid("(])"));
	}

}

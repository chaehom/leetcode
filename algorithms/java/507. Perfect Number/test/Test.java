import static org.junit.Assert.*;

/**
 * 507. Perfect Number
 * 
 * @author leo.ch
 * @since  2017-04-12
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		
		int[] acceptAnswers = {6, 28, 496, 8128, 33550336};
		for (int num : acceptAnswers)
		{
			assertTrue(solution.checkPerfectNumber(num));
		}
		
		int[] wrongAnswers = {1, 2, 100, 500};
		for (int num : wrongAnswers)
		{
			assertFalse(solution.checkPerfectNumber(num));
		}
	}

}

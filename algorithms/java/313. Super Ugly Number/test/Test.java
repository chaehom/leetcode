import static org.junit.Assert.*;

/**
 * 313. Super Ugly Number
 * 
 * @author leo.ch
 * @since  2017-03-29
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		int[] primes = {2, 7, 13, 19};
		int[] ansers = {0, 1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32};
		for (int i = 1; i < ansers.length; i++)
		{
			//System.out.println(i + ": " + ansers[i]);
			assertEquals(ansers[i], solution.nthSuperUglyNumber(i, primes));
		}
	}

}

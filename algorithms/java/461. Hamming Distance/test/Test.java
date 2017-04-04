import static org.junit.Assert.*;

/**
 * 461. Hamming Distance
 * 
 * @author leo.ch
 * @since  2017-04-04
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(2, solution.hammingDistance(1, 4));
		assertEquals(0, solution.hammingDistance(15, 15));
		assertEquals(3, solution.hammingDistance(7, 0));
		assertEquals(3, solution.hammingDistance(0, 7));
		assertEquals(0, solution.hammingDistance(0, 0));
		assertEquals(1, solution.hammingDistance(0, 8));
	}

}

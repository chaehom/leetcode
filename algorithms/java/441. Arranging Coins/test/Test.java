import static org.junit.Assert.*;

/**
 * 441. Arranging Coins
 * 
 * @author leo.ch
 * @since  2017-04-08
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(2, solution.arrangeCoins(5));
		assertEquals(3, solution.arrangeCoins(8));
		assertEquals(60070, solution.arrangeCoins(1804289383));
	}

}

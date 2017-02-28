import static org.junit.Assert.*;

/**
 * 122. Best Time to Buy and Sell Stock II
 * 
 * @author leo.ch
 * @since  2017-02-28
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1()
	{
		int[] prices = {7, 1, 5, 3, 6, 4};
		assertEquals(7, solution.maxProfit(prices));
	}
	
	@org.junit.Test
	public void test2()
	{
		int[] prices = {1, 2, 3, 4, 5, 6, 7};
		assertEquals(6, solution.maxProfit(prices));
	}
	
	@org.junit.Test
	public void test3()
	{
		int[] prices = {5, 4, 3, 2, 1};
		assertEquals(0, solution.maxProfit(prices));
	}

	@org.junit.Test
	public void test4()
	{
		int[] prices = {};
		assertEquals(0, solution.maxProfit(prices));
	}

}

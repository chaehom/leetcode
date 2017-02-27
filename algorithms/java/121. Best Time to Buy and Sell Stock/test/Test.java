import static org.junit.Assert.*;

/**
 * 121. Best Time to Buy and Sell Stock
 * 
 * @author leo.ch
 * @since  2017-02-27
 */
public class Test {

	Solution solution = new Solution();
	
	@org.junit.Test
	public void test1()
	{
		int[] prices = {7, 1, 5, 3, 6, 4};
					//  0, 0, 4, 4, 5, 5
		assertEquals(5, solution.maxProfit(prices));
	}

	@org.junit.Test
	public void test2()
	{
		int[] prices = {7, 6, 4, 3, 1};
		assertEquals(0, solution.maxProfit(prices));
	}

	@org.junit.Test
	public void test3()
	{
		int[] prices = {};
		assertEquals(0, solution.maxProfit(prices));
	}

	@org.junit.Test
	public void test4()
	{
		int[] prices = {2, 4, 1};
		assertEquals(2, solution.maxProfit(prices));
	}

	@org.junit.Test
	public void test5()
	{
		int[] prices = {3, 2, 6, 5, 0, 3};
					//  0, 0, 4, 4, 4, 4
		assertEquals(4, solution.maxProfit(prices));
	}
	
}


/**
 * 122. Best Time to Buy and Sell Stock II
 * 
 * @author leo.ch
 * @since  2017-02-28
 */
public class Solution
{
    public int maxProfit(int[] prices)
    {
    	int profit = 0;
    	for (int i = 1; i < prices.length; i++)
    	{
    		if (prices[i]-prices[i-1] > 0)
    		{
    			profit += prices[i]-prices[i-1];
    		}
    	}
        return profit;
    }
}

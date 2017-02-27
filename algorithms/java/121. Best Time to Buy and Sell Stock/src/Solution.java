
/**
 * 121. Best Time to Buy and Sell Stock
 * 
 * @author leo.ch
 * @since  2017-02-27
 */
public class Solution
{
    public int maxProfit(int[] prices)
    {
    	if (null == prices || prices.length == 0)
    	{
    		return 0;
    	}
    	int minPrice = prices[0];
    	int dp[] = new int[prices.length];
    	dp[0] = 0;
    	for (int i = 1; i < prices.length; i++)
    	{
    		if (prices[i] > prices[i - 1] && prices[i] - minPrice > dp[i - 1])
    		{
    			dp[i] = prices[i] - minPrice;
    		}
    		else
    		{
    			dp[i] = dp[i - 1];
    		}
			if (minPrice > prices[i])
    		{
    			minPrice = prices[i];
    		}
    	}
    	return dp[prices.length - 1];
    }
}

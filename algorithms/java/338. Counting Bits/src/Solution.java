
/**
 * 338. Counting Bits
 * 
 * @author leo.ch
 * @since  2017-03-31
 */
public class Solution {
	
	//规律： F(i) = F(i/2) + i%2;
    public int[] countBits(int num)
    {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++)
        {
        	dp[i] = dp[i/2] + (i%2);
        }
        return dp;
    }
}

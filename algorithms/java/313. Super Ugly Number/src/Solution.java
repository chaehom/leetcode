
/**
 * 313. Super Ugly Number
 * 
 * @author leo.ch
 * @since  2017-03-29
 */
public class Solution
{
    public int nthSuperUglyNumber(int n, int[] primes)
    {
        int[] dp = new int[n];
        dp[0] = 1;
        int[] idxs = new int[primes.length];
        for (int i = 1; i < n; i++)
        {
        	dp[i] = Integer.MAX_VALUE;
        	for (int j = 0; j < primes.length; j++)
        	{
        		dp[i] = Math.min(dp[i], dp[idxs[j]]*primes[j]);
        	}
        	for (int j = 0; j < idxs.length; j++)
        	{
        		if (dp[i] == dp[idxs[j]]*primes[j])
        		{
        			idxs[j]++;
        		}
        	}
        }
        return dp[n-1];
    }
}

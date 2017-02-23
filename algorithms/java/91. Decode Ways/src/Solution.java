
/**
 * 91. Decode Ways
 * 
 * @author leo.ch
 * @since  2017-02-23
 */
public class Solution
{
    public int numDecodings(String s)
    {
    	if (null == s || s.isEmpty())
    	{
    		return 0;
    	}
    	
    	int len = s.length();
        int[] dp = new int[len + 1];
        dp[len] = 1;
        dp[len - 1] = s.charAt(len - 1) != '0' ? 1 : 0;
        
        for (int i = len - 2; i >= 0; i--)
        {
        	if (s.charAt(i) == '0')
        	{
        		continue;
        	}
        	if ((s.charAt(i)-'0')*10+(s.charAt(i + 1)-'0') <= 26)
        	{
        		dp[i] = dp[i + 2] + dp[i + 1];
        	}
        	else
        	{
        		dp[i] = dp[i + 1];
        	}
        }
        
        return dp[0];
    }
}

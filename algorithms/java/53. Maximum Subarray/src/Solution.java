
/**
 * 53. Maximum Subarray
 * 
 * @author leo.ch
 * @since  2017-03-11
 */
public class Solution
{
    public int maxSubArray(int[] nums)
    {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
        	if (nums[i] < 0)
        	{
        		dp[i] = (dp[i-1] < 0) ? nums[i] : dp[i-1] + nums[i];
        	}
        	else
        	{
        		dp[i] = (dp[i-1] + nums[i] > nums[i]) ? (dp[i-1] + nums[i]) : nums[i];
        	}
        	
        	if (max < dp[i])
        	{
        		max = dp[i];
        	}
        }
        return max;
    }
}

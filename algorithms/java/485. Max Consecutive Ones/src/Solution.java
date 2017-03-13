
/**
 * 485. Max Consecutive Ones
 * 
 * @author leo.ch
 * @since  2017-03-13
 */
public class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int max = 0;
        int consecutive = 0;
        for (int i = 0; i < nums.length; i++)
        {
        	if (nums[i] == 1)
        	{
        		consecutive++;
        		if (consecutive > max)
        		{
        			max = consecutive;
        		}
        	}
        	else
        	{
        		consecutive = 0;
        	}
        }
        return max;
    }
}

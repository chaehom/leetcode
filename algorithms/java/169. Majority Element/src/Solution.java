/**
 * 169. Majority Element
 * 
 * @author leo.ch
 * @since  2017-03-06
 */
public class Solution {
    public int majorityElement(int[] nums)
    {
    	//MOORE'S VOTE
        int cnt = 0, ans = 0;
        for (int i = 0; i < nums.length; i++)
        {
        	if (cnt == 0)
        	{
        		ans = nums[i];
        		cnt++;
        	}
        	else if (ans == nums[i])
        	{
        		cnt++;
        	}
        	else
        	{
        		cnt--;
        	}
        }
        return ans;
    }
}

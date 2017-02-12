
/**
 * 27. Remove Element
 * 
 * @author leo.ch
 * @since  2017-02-12
 */
public class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
    	if (nums.length == 0)
    	{
    		return 0;
    	}
        int i = 0;
        int ans = nums.length - 1;
        while (i < ans)
        {
        	if (nums[i] == val)
        	{
        		while (ans > i && nums[ans] == val)
        		{
        			ans--;
        		}
        		nums[i] = nums[ans--];
        	}
        	i++;
        }
        if (i == ans && nums[i] == val)
        {
        	ans--;
        }
        return ans + 1;
    }
}

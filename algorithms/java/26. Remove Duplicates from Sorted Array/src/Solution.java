
/**
 * 26. Remove Duplicates from Sorted Array
 * 
 * @author leo.ch
 * @since  2017-02-12
 */
public class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
    	if (nums.length < 2)
    	{
    		return nums.length;
    	}
    	
    	int ans = 0;
    	for (int i = 1; i < nums.length; i++)
    	{
    		if (nums[ans] != nums[i])
    		{
    			ans++;
    			nums[ans] = nums[i];
    		}
    	}
        return ans + 1;
    }
}

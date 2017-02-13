
/**
 * 35. Search Insert Position
 * 
 * @author leo.ch
 * @since  2017-02-13
 */
public class Solution 
{
	public int searchInsert(int[] nums, int target) 
	{
		if (nums.length == 0)
		{
			return 0;
		}
		int ans = 0;
		while (ans < nums.length && target > nums[ans])
		{
			ans++;
		}
        return ans;
    }
}

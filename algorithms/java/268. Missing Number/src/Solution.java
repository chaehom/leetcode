import java.util.Arrays;

/**
 * 268. Missing Number
 * 
 * @author leo.ch
 * @since  2017-03-27
 */
public class Solution 
{
	/**
	 * 异或
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums)
	{
		int xor = nums.length;
		for (int i = 0; i < nums.length; i++)
		{
			xor ^= (i ^ nums[i]);
		}
		return xor;
	}
	
	/**
	 * 二分查找
	 * @param nums
	 * @return
	 */
    public int missingNumber1(int[] nums)
    {
        Arrays.sort(nums);
        
        int low = 0, height = nums.length;
        while (low < height)
        {
        	int mid = (low + height) / 2;
        	if (nums[mid] > mid)
        	{
        		height = mid;
        	}
        	else
        	{
        		low = mid + 1;
        	}
        }
        return low;
    }
}

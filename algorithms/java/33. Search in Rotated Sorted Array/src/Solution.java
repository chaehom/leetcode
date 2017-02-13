
/**
 * 33. Search in Rotated Sorted Array
 * 
 * @author leo.ch
 * @since  2017-02-13
 */
public class Solution 
{
	public int search(int[] nums, int target) 
	{
        int s = 0, e = nums.length - 1;
        while (s <= e)
        {
        	int mid = (s + e) / 2;
        	
        	if (nums[mid] == target)
        	{
        		return mid;
        	}
        	
        	if (nums[s] <= nums[mid])
        	{
        		if (nums[s] <= target && target < nums[mid])
        		{
        			e = mid - 1;
        		}
        		else
        		{
        			s = mid + 1;
        		}
        	}
        	
        	if (nums[mid] <= nums[e])
        	{
        		if (nums[mid] < target && target <= nums[e])
        		{
        			s = mid + 1;
        		}
        		else
        		{
        			e = mid - 1;
        		}
        	}
        }
        return -1;
    }
}

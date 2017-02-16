
/**
 * 34. Search for a Range
 * 
 * @author leo.ch
 * @since  2017-02-16
 */
public class Solution
{
	public int[] searchRange(int[] nums, int target) 
	{
		int start = searchStart(nums, target);
		int end = searchEnd(nums, target);
		return new int[]{start, end};
    }

	/**
	 * 搜索第一个target
	 */
	private int searchStart(int[] nums, int target) 
	{
		int pos = -1;
		int start = 0, end = nums.length - 1;
		while (start <= end)
		{
			int mid = (start + end) / 2;
			if (nums[mid] >= target)
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			if (nums[mid] == target)
			{
				pos = mid; 
			}
		}
		return pos;
	}

	/**
	 * 搜索最后一个target
	 */
	private int searchEnd(int[] nums, int target) 
	{
		int pos = -1;
		int start = 0, end = nums.length - 1;
		while (start <= end)
		{
			int mid = (start + end) / 2;
			if (nums[mid] <= target)
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
			if (nums[mid] == target)
			{
				pos = mid; 
			}
		}
		return pos;
	}
}

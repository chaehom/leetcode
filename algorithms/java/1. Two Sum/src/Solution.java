import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * 
 * @author leo.ch
 * @since   2017-02-05
 */
public class Solution 
{
	public int[] twoSum(int[] nums, int target) 
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(0);
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) 
		{
			int p = nums[i];
			int q = target - p;
			if (map.containsKey(q))
			{
				res[0] = map.get(q);
				res[1] = i;
				break;
			}
			map.put(p, i);
		}
		return res;
    }
}

import java.util.HashMap;
import java.util.Map;

/**
 * 219. Contains Duplicate II
 * 
 * @author leo.ch
 * @since  2017-03-17
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if (nums.length < 2 || k < 1)
    	{
    		return false;
    	}
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
        	if (m.containsKey(nums[i]))
        	{
        		int j = m.get(nums[i]);
        		if (Math.abs(i - j) <= k)
        		{
        			return true;
        		}
        	}
        	m.put(nums[i], i);
        }
        return false;
    }
}

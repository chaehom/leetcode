import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * 
 * @author leo.ch
 * @since  2017-04-20
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
    	List<Integer> result = new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++)
    	{
    		int pos = Math.abs(nums[i]) - 1;
    		if (nums[pos] > 0)
    		{
    			nums[pos] = -nums[pos];
    		}
    	}
    	for (int i = 0; i < nums.length; i++)
    	{
    		if (nums[i] > 0)
    		{
    			result.add(i+1);
    		}
    	}
    	return result;
    }
}

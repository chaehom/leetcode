import java.util.ArrayList;
import java.util.List;

/**
 * 228. Summary Ranges
 * 
 * @author leo.ch
 * @since  2017-03-22
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++)
        {
        	int start = nums[i];
        	while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
        	{
        		i++;
        	}
        	int end = nums[i];
        	
        	if (start == end)
        	{
        		ranges.add("" + start);
        	}
        	else
        	{
        		ranges.add(start + "->" + end);
        	}
        }
        return ranges;
    }
}

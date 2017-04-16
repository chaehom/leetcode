import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 506. Relative Ranks
 * 
 * @author leo.ch
 * @since  2017-04-16
 */
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> scoresMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
        	scoresMap.put(nums[i], i);
        }
        
        String[] answer = new String[nums.length];
        Arrays.sort(nums);
        for (int i = nums.length - 1, rank = 1; i >= 0; i--, rank++)
        {
        	int idx = scoresMap.get(nums[i]);
        	if (rank > 3)
        	{
            	answer[idx] = rank + "";
        	}
        	else if (rank == 1)
        	{
        		answer[idx] = "Gold Medal";
        	}
        	else if (rank == 2)
        	{
        		answer[idx] = "Silver Medal";
        	}
        	else
        	{
        		answer[idx] = "Bronze Medal";
        	}
        }
        return answer;
    }
}

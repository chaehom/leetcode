import java.util.HashMap;
import java.util.Map;

/**
 * 167. Two Sum II - Input array is sorted
 * 
 * @author leo.ch
 * @since  2017-03-07
 */
public class Solution 
{
    public int[] twoSum(int[] numbers, int target)
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++)
        {
        	int p = numbers[i];
        	int q = target - p;
        	if (map.containsKey(q))
        	{
        		ans[0] = map.get(q) + 1;
        		ans[1] = i + 1;
        		break;
        	}
        	map.put(p, i);
        }
        return ans;
    }
}

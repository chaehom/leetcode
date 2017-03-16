import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * 
 * @author leo.ch
 * @since  2017-03-16
 */
public class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        Set<Integer> n = new HashSet<Integer>();
        for (int num : nums)
        {
        	if (n.contains(num))
        	{
        		return true;
        	}
        	n.add(num);
        }
        return false;
    }
}

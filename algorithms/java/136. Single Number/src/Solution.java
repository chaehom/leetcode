
/**
 * 136. Single Number
 * 
 * @author leo.ch
 * @since  2017-03-01
 */
public class Solution
{
    public int singleNumber(int[] nums) {
    	int ans = 0;
    	for (int i = 0; i < nums.length; i++)
    	{
    		ans ^= nums[i];
    	}
        return ans;
    }
}

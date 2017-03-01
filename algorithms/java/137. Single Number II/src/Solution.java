
/**
 * 137. Single Number II
 * 
 * @author leo.ch
 * @since  2017-03-01
 */
public class Solution
{
    public int singleNumber(int[] nums)
    {
    	int ones = 0, twos = 0;
    	System.out.println(~twos);
        for(int i = 0; i < nums.length; i++)
        {
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;
    }
}

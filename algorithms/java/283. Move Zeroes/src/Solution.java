
/**
 * 283. Move Zeroes
 * 
 * @author leo.ch
 * @since  2017-03-13
 */
public class Solution {
    public void moveZeroes(int[] nums) {
    	int p = 0, q = 0;
        while (p < nums.length && q <= p)
        {
        	nums[q] = nums[p];
        	if (nums[p] != 0)
        	{
        		p++;
        		q++;
        	}
        	else
        	{
        		p++;
        	}
        }
        while (q < p)
        {
        	nums[q++] = 0;
        }
    }
}


/**
 * 553. Optimal Division
 * 
 * @author leo.ch
 * @since  2017-04-18
 */
public class Solution {
	public String optimalDivision(int[] nums) {
        if (nums.length == 1)
        {
        	return nums[0] + "";
        }
        if (nums.length == 2)
        {
        	return nums[0] + "/" + nums[1];
        }
        StringBuilder res = new StringBuilder(nums[0] + "/(" + nums[1]);
        for (int i = 2; i < nums.length; i++)
        {
            res.append("/" + nums[i]);
        }
        res.append(")");
        return res.toString();
    }
}

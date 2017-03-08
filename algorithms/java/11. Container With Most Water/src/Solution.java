
/**
 * 11. Container With Most Water
 * 
 * @author leo.ch
 * @since  2017-03-08
 */
public class Solution
{
    public int maxArea(int[] height)
    {
    	int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right)
        {
        	maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        	if (height[left] < height[right])
        	{
        		left++;
        	}
        	else
        	{
        		right--;
        	}
        }
        return maxArea;
    }
}

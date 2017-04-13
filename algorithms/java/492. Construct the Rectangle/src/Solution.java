
/**
 * 492. Construct the Rectangle
 * 
 * @author leo.ch
 * @since  2017-04-13
 */
public class Solution
{
    public int[] constructRectangle(int area)
    {
    	int[] ans = new int[2];
    	int min = Integer.MAX_VALUE;
        for (int w = 1; w * w <= area; w++)
        {
        	if (area % w == 0)
        	{
        		int l = area/w;
        		if (l - w < min)
        		{
        			min = l - w;
        			ans[0] = l;
        			ans[1] = w;
        		}
        	}
        }
        return ans;
    }
}


/**
 * 69. Sqrt(x)
 * 
 * @author leo.ch
 * @since  2017-03-11
 */
public class Solution {
    public int mySqrt(int x)
    {
    	int l = 1, r = x;
    	//可以从1暴力到x/2，但是会TLE，所以用二分搜索，不断减小范围
    	//二分搜索
    	while (l <= r)
    	{
    		int mid = l + (r - l) / 2;
    		// 预防mid*mid溢出，所以用除法
    		if (mid == x / mid)
    		{
    			return mid;
    		}
    		else if (mid < x / mid)
    		{
    			l = mid + 1;
    		}
    		else
    		{
    			r = mid - 1;
    		}
    	}
    	return r;
    }
}

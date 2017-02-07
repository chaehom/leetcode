/**
 * 7. Reverse Integer
 * 
 * @author leo.ch
 * @since  2017-02-07
 */
public class Solution 
{
    public int reverse(int x) 
    {
    	long ans = 0;
    	while (x != 0)
    	{
    		ans = ans * 10 + x % 10;
    		x /= 10;
    		if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
    		{
    			return 0;
    		}
    	}
        return (int)ans;
    }
}

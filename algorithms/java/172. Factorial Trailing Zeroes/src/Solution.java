
/**
 * 172. Factorial Trailing Zeroes
 * 
 * @author leo.ch
 * @since  2017-03-07
 */
public class Solution
{
    public int trailingZeroes(int n) 
    {
    	/**
    	 * n!后缀0的个数 = n!质因子中5的个数
    	 *           = floor(n/5) + floor(n/25) + floor(n/125) + ....
    	 */
        int zeros = 0;
        while (n != 0)
        {
        	zeros += n / 5;
        	n /= 5;
        }
        return zeros;
    }
}

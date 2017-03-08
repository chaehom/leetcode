
/**
 * 29. Divide Two Integers
 * 
 * @author leo.ch
 * @since  2017-03-08
 */
public class Solution
{
    public int divide(int dividend, int divisor)
    {
        if (0 == divisor || (dividend == Integer.MIN_VALUE && divisor == -1))
        {
        	return Integer.MAX_VALUE;
        }
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        int res = 0;
        
        //F(17, 2) = 17/2 = 16/2 + 1/2 = 8 + 0 = 8
        //F(18, 3) = 18/3 = 12/3 + 6/3 = 4 + 2 = 6
        while (dvd >= dvs)
        {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1))
            {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            res += multiple;
        }
        return ((dividend < 0) ^ (divisor < 0)) ? -res : res;
    }
}

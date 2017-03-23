
/**
 * 231. Power of Two
 * 
 * @author leo.ch
 * @since  2017-03-23
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        int base = 1;
        while (base > 0 && base < Integer.MAX_VALUE)
        {
        	if (base == n)
        	{
        		return true;
        	}
        	base <<= 1;
        }
        return false;
    }
}

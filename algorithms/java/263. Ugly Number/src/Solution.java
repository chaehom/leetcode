
/**
 * 263. Ugly Number
 * 
 * @author leo.ch
 * @since  2017-03-26
 */
public class Solution {
    public boolean isUgly(int num) {
        if (num < 1)
        {
        	return false;
        }
        int[] divs = {2, 3, 5};
        for (int div : divs)
        {
        	while (num % div == 0)
        	{
        		num /= div;
        	}
        }
        return num == 1;
    }
}

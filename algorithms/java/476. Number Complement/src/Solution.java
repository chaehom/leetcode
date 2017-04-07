
/**
 * 476. Number Complement
 * 
 * @author leo.ch
 * @since  2017-04-07
 */
public class Solution {
    public int findComplement(int num) {
        int x = 1;
        while (x > 0 && x <= num)
        {
        	x <<= 1;
        }
        return x - 1 - num;
    }
}

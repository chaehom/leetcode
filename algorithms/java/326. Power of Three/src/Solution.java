
/**
 * 326. Power of Three
 * 
 * @author leo.ch
 * @since  2017-03-31
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        return (n > 0) && (1162261467 % n == 0);
    }
}

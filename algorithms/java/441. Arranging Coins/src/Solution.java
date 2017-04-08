
/**
 * 441. Arranging Coins
 * 
 * @author leo.ch
 * @since  2017-04-08
 */
public class Solution {
    public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8*(long)n)) / 2);
    }
}

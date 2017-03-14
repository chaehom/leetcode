
/**
 * 258. Add Digits
 * 
 * @author leo.ch
 * @since  2017-03-14
 */
public class Solution {
    public int addDigits(int num) {
    	//规律: 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 ... so.. 
        return 1 + (num - 1) % 9;
    }
}

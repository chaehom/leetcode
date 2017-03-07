
/**
 * 171. Excel Sheet Column Number
 * 
 * @author leo.ch
 * @since  2017-03-07
 */
public class Solution
{
    public int titleToNumber(String s)
    {
        int num = 0;
        for (char c : s.toCharArray())
        {
        	num = num * 26 + (c - 'A' + 1);
        }
        return num;
    }
}

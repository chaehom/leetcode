
/**
 * 58. Length of Last Word
 * 
 * @author leo.ch
 * @since  2017-02-18
 */
public class Solution
{
    public int lengthOfLastWord(String s) 
    {
        if (null == s)
        {
        	return 0;
        }
        s = s.trim();
        return s.length() - s.lastIndexOf(' ') - 1;
    }
}

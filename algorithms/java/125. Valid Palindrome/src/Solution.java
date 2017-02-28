
/**
 * 125. Valid Palindrome
 * 
 * @author leo.ch
 * @since  2017-02-28
 */
public class Solution
{
    public boolean isPalindrome(String s)
    {
    	if (null == s)
    	{
    		return true;
    	}
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j)
        {
        	while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
        	{
        		i++;
        	}
        	while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
        	{
        		j--;
        	}
        	if (i <= j && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j)))
        	{
        		i++;
        		j--;
        	}
        	else
        	{
        		return false;
        	}
        }
        return true;
    }
}

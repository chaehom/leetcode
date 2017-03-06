
/**
 * 168. Excel Sheet Column Title
 * 
 * @author leo.ch
 * @since  2017-03-06
 */
public class Solution
{
    public String convertToTitle(int n)
    {
        String title = "";
        while (n != 0)
        {
        	n--;
        	title = (char)('A' + n % 26) + title;
        	n /= 26;
        }
        return title;
    }
}

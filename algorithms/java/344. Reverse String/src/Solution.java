
/**
 * 344. Reverse String
 * 
 * @author leo.ch
 * @since  2017-04-01
 */
public class Solution {
    public String reverseString(String s) {
    	char[] str = s.toCharArray();
        for (int i = 0, j = str.length - 1; i < j; i++, j--)
        {
        	char tmp = str[i];
        	str[i] = str[j];
        	str[j] = tmp;
        }
        return new String(str);
    }
}

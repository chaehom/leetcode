
/**
 * 345. Reverse Vowels of a String
 * 
 * @author leo.ch
 * @since  2017-04-02
 */
public class Solution {
    public String reverseVowels(String s) {
    	char[] str = s.toCharArray();
    	int i = 0, j = str.length - 1;
    	while (i < j)
    	{
    		while (i < j && "aeiouAEIOU".indexOf(str[i]) == -1)
    		{
    			i++;
    		}
    		while (i < j && "aeiouAEIOU".indexOf(str[j]) == -1)
    		{
    			j--;
    		}
    		if (i < j)
    		{
    			char tmp = str[i];
    			str[i] = str[j];
    			str[j] = tmp;
    		}
    		i++;
    		j--;
    	}
    	return new String(str);
    }
}

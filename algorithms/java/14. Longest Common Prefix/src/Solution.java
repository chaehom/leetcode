
/**
 * 14. Longest Common Prefix
 * 
 * @author leo.ch
 * @since  2017-02-09
 */
public class Solution 
{
	public String longestCommonPrefix(String[] strs) 
	{
		if (strs.length == 0)
		{
			return "";
		}
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++)
        {
        	int j = 0;
        	while (j < ans.length() && j < strs[i].length() && ans.charAt(j) == strs[i].charAt(j))
        	{
        		j++;
        	}
        	ans = ans.substring(0, j);
        }
        return ans;
    }
}

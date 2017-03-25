
/**
 * 242. Valid Anagram
 * 
 * @author leo.ch
 * @since  2017-03-25
 */
public class Solution {
    public boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
        {
        	return false;
        }
        int[] rec = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
        	rec[s.charAt(i) - 'a']++;
        	rec[t.charAt(i) - 'a']--;
        }
        for (int p : rec)
        {
        	if (p != 0)
        	{
        		return false;
        	}
        }
        return true;
    }
}

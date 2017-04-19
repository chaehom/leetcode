/**
 * 383. Ransom Note
 * 
 * @author leo.ch
 * @since  2017-04-19
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
    {
    	int[] m = new int[26];
    	for (char c : magazine.toCharArray())
    	{
    		m[c-'a']++;
    	}
    	for (char c : ransomNote.toCharArray())
    	{
    		m[c-'a']--;
    		if (m[c-'a'] < 0)
    		{
    			return false;
    		}
    	}
    	return true;
    }
}

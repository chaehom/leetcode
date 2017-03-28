import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 * 
 * @author leo.ch
 * @since  2017-03-28
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
    	String[] words = str.split(" ");
    	if (pattern.length() != words.length)
    	{
    		return false;
    	}
    	
    	Map<Character, String> patternWord = new HashMap<Character, String>();
    	for (int i = 0; i < words.length; i++)
    	{
    		char pat = pattern.charAt(i);
    		if (patternWord.containsKey(pat))
    		{
    			if (!patternWord.get(pat).equals(words[i]))
    			{
    				return false;
    			}
    		}
    		else
    		{
    			if (patternWord.containsValue(words[i]))
    			{
    				return false;
    			}
    			patternWord.put(pat, words[i]);
    		}
    	}
    	return true;
    }
}

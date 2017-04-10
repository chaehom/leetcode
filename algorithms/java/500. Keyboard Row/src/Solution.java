import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 500. Keyboard Row
 * 
 * @author leo.ch
 * @since  2017-04-11
 */
public class Solution {
    public String[] findWords(String[] words) {
        Set<Character> line1 = makeSet("qwertyuiop");
        Set<Character> line2 = makeSet("asdfghjkl");
        Set<Character> line3 = makeSet("zxcvbnm");
        
        List<String> result = new ArrayList<String>();
        for (String word : words)
        {
        	Set<Character> wordSet = makeSet(word.toLowerCase());
        	if (line1.containsAll(wordSet) || line2.containsAll(wordSet) || line3.containsAll(wordSet))
        	{
        		result.add(word);
        	}
        }
        return result.toArray(new String[result.size()]);
    }
    
    private Set<Character> makeSet(String str)
    {
    	Set<Character> set = new HashSet<Character>();
    	for (char c : str.toCharArray())
    	{
    		set.add(c);
    	}
    	return set;
    }
}

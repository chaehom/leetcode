import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams
 * 
 * @author leo.ch
 * @since  2017-02-18
 */
public class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> groups = new LinkedHashMap<String, List<String>>();
        Arrays.sort(strs);
        for (String str : strs)
        {
        	String key = order(str);
        	if (!groups.containsKey(key))
        	{
        		groups.put(key, new ArrayList<String>());
        	}
        	groups.get(key).add(str);
        }
        
        return new ArrayList<List<String>>(groups.values());
    }

	private String order(String str) 
	{
		char[] orderStr = str.toCharArray();
		Arrays.sort(orderStr);
		return new String(orderStr);
	}
}

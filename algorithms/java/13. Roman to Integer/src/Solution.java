import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 13. Roman to Integer
 * 
 * @author leo.ch
 * @since  2017-02-08
 */
public class Solution 
{
	public int romanToInt(String s) 
	{
		String[] romanSymbols = {
			"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
			"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
			"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
			"M", "MM", "MMM"
		};
		int[] values = {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 
			10, 20, 30, 40, 50, 60, 70, 80, 90, 
			100, 200, 300, 400, 500, 600, 700, 800, 900, 
			1000, 2000, 3000
		};
		Map<String, Integer> romanMap = new LinkedHashMap<String, Integer>();
		for (int i = romanSymbols.length - 1; i >= 0; i--)
		{
			romanMap.put(romanSymbols[i], values[i]);
		}
		
		int ans = 0, idx = 0;
		while (idx < s.length())
		{
			for (Entry<String, Integer> romanEntry : romanMap.entrySet())
			{
				String romanSymbol = romanEntry.getKey();
				if (s.startsWith(romanSymbol))
				{
					ans += romanEntry.getValue();
					s = s.substring(romanSymbol.length());
					break;
				}
			}
		}
		
        return ans;
    }
}

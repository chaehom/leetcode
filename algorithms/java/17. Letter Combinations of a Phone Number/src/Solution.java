import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 * 
 * @author leo.ch
 * @since  2017-02-11
 */
public class Solution 
{
	private String[] letters = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public List<String> letterCombinations(String digits) 
	{
		List<String> ans = new ArrayList<String>();
		if (digits.isEmpty())
		{
			return ans;
		}
	
		String keyLetters = letters[digits.charAt(0) - '0'];
		for (char letter : keyLetters.toCharArray())
		{
			List<String> nextLetters = letterCombinations(digits.substring(1));
			if (nextLetters.isEmpty())
			{
				ans.add(letter + "");
			}
			else
			{
				for (String str : nextLetters)
				{
					ans.add(letter + str);
				}
			}
		}
		
		return ans;
    }
}

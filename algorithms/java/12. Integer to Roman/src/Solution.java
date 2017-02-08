
/**
 * 12. Integer to Roman
 * 
 * @author leo.ch
 * @since  2017-02-08
 */
public class Solution 
{
	public String intToRoman(int num) 
	{
		String a[][] = {
			{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
			{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
			{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
			{"", "M", "MM", "MMM"}
		};
		StringBuffer roman = new StringBuffer();
		String str = "" + num;
		for (int i = 0; i < str.length(); i++)
		{
			int pos = str.length() - 1 - i;
			int digit = str.charAt(i) - '0';
			roman.append(a[pos][digit]);
		}
		return roman.toString();
    }
}

/**
 * 67. Add Binary
 * 
 * @author leo.ch
 * @since  2017-02-19
 */
public class Solution
{
	public String addBinary(String a, String b)
	{
		StringBuffer ans = new StringBuffer();
		int aLast = a.length() - 1;
		int bLast = b.length() - 1;
		int c = 0;
		while (aLast >=0 && bLast >= 0)
		{
			int aa = a.charAt(aLast--) - '0';
			int bb = b.charAt(bLast--) - '0';
			int cc = aa + bb + c;
			c = cc / 2;
			ans.append(cc % 2);
		}
		while (aLast >= 0)
		{
			int aa = a.charAt(aLast--) - '0';
			int cc = aa + c;
			c = cc / 2;
			ans.append(cc % 2);
		}
		while (bLast >= 0)
		{
			int bb = b.charAt(bLast--) - '0';
			int cc = bb + c;
			c = cc / 2;
			ans.append(cc % 2);
		}
		if (c == 1)
		{
			ans.append(1);
		}
		return ans.reverse().toString();
	}
}

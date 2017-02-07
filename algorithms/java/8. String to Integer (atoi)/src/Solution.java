
/**
 * 8. String to Integer (atoi)
 * 
 * @author leo.ch
 * @since  2017-02-07
 */
public class Solution {
	public int myAtoi(String str) 
	{
		str = str.trim();
		if (str.isEmpty())
		{
			return 0;
		}
		long ans = 0;
		int idx = 0, sign = 1;
		char c = str.charAt(idx);
		if (c == '+' || c == '-')
		{
			if (c == '-')
			{
				sign = -1;
			}
			idx++;
		}
		while(idx < str.length())
		{
			int digit = str.charAt(idx) - '0';
			if (digit < 0 || digit > 9)
			{
				break;
			}
			
			ans = ans * 10 + digit;
			if (sign == 1 && ans > Integer.MAX_VALUE)
			{
				return Integer.MAX_VALUE;
			}
			else if (sign == -1 && ans * sign < Integer.MIN_VALUE)
			{
				return Integer.MIN_VALUE;
			}
			
			idx++;
		}
		return (int)ans * sign;
    }
}

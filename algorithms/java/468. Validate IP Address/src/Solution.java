import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 468. Validate IP Address
 * 
 * @author leo.ch
 * @since  2017-04-06
 */
public class Solution {
    public String validIPAddress(String IP) {
        if (isIPv4(IP))
        {
        	return "IPv4";
        }
        else if (isIPv6(IP))
        {
        	return "IPv6";
        }
        else
        {
        	return "Neither";
        }
    }

	private boolean isIPv4(String IP)
	{
		Pattern pattern = Pattern.compile("^([1-9]\\d{0,2}|0)(\\.([1-9]\\d{0,2}|0)){3}$");
		Matcher matcher = pattern.matcher(IP);
		if (matcher.matches())
		{
			String[] parts = IP.split("\\.");
			for (String part : parts)
			{
				int n = Integer.valueOf(part);
				if (n < 0 || n > 255)
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private boolean isIPv6(String IP)
	{
		Pattern pattern = Pattern.compile("^([0-9a-fA-F]{1,4})(\\:[0-9a-fA-F]{1,4}){7}$");
		Matcher matcher = pattern.matcher(IP);
		return matcher.matches();
	}
}

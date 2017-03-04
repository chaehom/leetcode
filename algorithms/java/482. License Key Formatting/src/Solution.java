
/**
 * 482. License Key Formatting
 * 
 * @author leo.ch
 * @since  2017-03-04
 */
public class Solution
{
    public String licenseKeyFormatting(String S, int K)
    {
    	StringBuffer sb = new StringBuffer(S.replace("-", "").toUpperCase());
    	for (int i = sb.length() - K; i > 0; i -= K)
    	{
    		sb.insert(i, "-");
    	}
        return sb.toString();
    }
}

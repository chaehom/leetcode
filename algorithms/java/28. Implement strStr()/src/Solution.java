
/**
 * 28. Implement strStr()
 * 
 * @author leo.ch
 * @since  2017-03-04
 */
public class Solution
{
    public int strStr(String haystack, String needle)
    {
    	//the laziest solution...HAHA
        //return haystack.indexOf(needle);
    	
    	int hLen = haystack.length();
    	int nLen = needle.length();
    	
    	if (hLen < nLen)
    	{
    		return -1;
    	}
    	else if (nLen == 0)
    	{
    		return 0;
    	}
    	for (int i = 0; i < hLen; i++)
    	{
    		//Look for first character
    		while (i < hLen && haystack.charAt(i) != needle.charAt(0))
    		{
    			i++;
    		}
    		
    		//if the rest haystack string is long enough
    		if (i <= hLen - nLen)
    		{
	    		int p = 0;
	    		//compare needle
	    		while (p < nLen && haystack.charAt(i + p) == needle.charAt(p))
	    		{
	    			p++;
	    		}
	    		//found
	    		if (p == nLen)
	    		{
	    			return i;
	    		}
    		}
    	}
    	return -1;
    }
}

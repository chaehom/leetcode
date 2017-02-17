
/**
 * 38. Count and Say
 * 
 * @author leo.ch
 * @since  2017-02-17
 */
public class Solution 
{
    public String countAndSay(int n) 
    {
    	String seq = "1";
    	while (--n > 0)
    	{
    		seq = say(seq);
    	}
        return seq;
    }

	private String say(String seq)
	{
		StringBuffer sb = new StringBuffer();
		int idx = 0;
		while (idx < seq.length())
		{
			int cnt = 1;
			char cur = seq.charAt(idx++);
			while (idx < seq.length() && seq.charAt(idx) == cur)
			{
				idx++;
				cnt++;
			}
			sb.append(cnt).append(cur);
		}
		return sb.toString();
	}
}

/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * @author leo.ch
 * @since  2017-02-06
 */
public class Solution 
{
	/**
	 * 寻找最长无重复字符的子串长度
	 * 其实就是求两个连续相同字符之间距离最大的值
	 * @param s
	 * @return
	 */
    public int lengthOfLongestSubstring(String s) 
    {
    	//记录字符上次出现的位置，为了节省初始化lastIdx时间，开始位置下标约定为1
    	int[] lastIdx = new int[256];
    	int idx = 0, max = 0, startIdx = 0;
    	while (idx < s.length())
    	{
    		char ch = s.charAt(idx);
    		if (lastIdx[ch] > startIdx)
    		{
    			startIdx = lastIdx[ch];
    		}
    		//字符串下标从1开始算，所以这里先i+1
    		idx++;
			max = Math.max(idx - startIdx, max);
			lastIdx[ch] = idx;
    	}
        return max;
    }
}

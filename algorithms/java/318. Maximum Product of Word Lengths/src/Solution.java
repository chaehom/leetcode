/**
 * 318. Maximum Product of Word Lengths
 * 
 * @author leo.ch
 * @since  2017-03-30
 */
public class Solution
{
    public int maxProduct(String[] words) {
    	//word转成位图
    	int[] nums = new int[words.length];
    	//word长度
    	int[] lens = new int[words.length];
    	
    	//word转成位图bitmap
        for (int i = 0; i < words.length; i++)
        {
        	nums[i] = 0;
    		for (char c : words[i].toCharArray())
    		{
    			nums[i] |= (1 << (c-'a'));
    		}
        	lens[i] = words[i].length();
        }
        
        int max = 0;
        for (int i = 0; i < nums.length; i++)
        {
        	for (int j = i + 1; j < nums.length && i != j; j++)
        	{
        		//判断字母不重复的word
        		if ((nums[i] ^ nums[j]) == (nums[i] + nums[j]))
        		{
        			max = Math.max(max, lens[i] * lens[j]);
        		}
        	}
        }
        return max;
    }
}

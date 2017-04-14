import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 496. Next Greater Element I
 * 
 * @author leo.ch
 * @since  2017-04-14
 */
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	Stack<Integer> stack = new Stack<>();
    	for (int num : nums)
    	{
    		while (!stack.isEmpty() && stack.peek() < num)
    		{
    			map.put(stack.pop(), num);
    		}
    		stack.push(num);
    	}
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++)
        {
        	result[i] = map.getOrDefault(findNums[i], -1);
        }
        return result;
    }
}

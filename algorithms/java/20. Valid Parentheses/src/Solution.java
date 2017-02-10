import java.util.Stack;

/**
 * 20. Valid Parentheses
 * 
 * @author leo.ch
 * @since  2017-02-10
 */
public class Solution 
{
	public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	for (char ch : s.toCharArray()) 
    	{
    		if (ch == '(')
    		{
    			stack.push(')');
    		}
    		else if (ch == '{')
    		{
    			stack.push('}');
    		}
    		else if (ch == '[')
    		{
    			stack.push(']');
    		}
    		else if (stack.isEmpty() || stack.pop() != ch)
    		{
    			return false;
    		}
    	}
    	return stack.isEmpty();
	}
}

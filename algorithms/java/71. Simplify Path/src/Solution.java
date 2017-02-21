import java.util.Stack;

/**
 * 71. Simplify Path
 * 
 * @author leo.ch
 * @since  2017-02-21
 */
public class Solution
{
    public String simplifyPath(String path)
    {
        Stack<String> pathStack = new Stack<String>();
        String[] dirs = path.split("/");
        for (String dir : dirs)
        {
        	if ("".equals(dir) || ".".equals(dir))
        	{
        		continue;
        	}
        	else if (!"..".equals(dir))
        	{
        		pathStack.push(dir);
        	}
        	else if (!pathStack.isEmpty())
        	{
        		pathStack.pop();
        	}
        }
        StringBuffer ans = new StringBuffer();
        if (pathStack.isEmpty())
        {
        	return "/";
        }
        for (String dir : pathStack)
        {
        	ans.append("/" + dir);
        }
        return ans.toString();
    }
}

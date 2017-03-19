
/**
 * 222. Count Complete Tree Nodes
 * 
 * @author leo.ch
 * @since  2017-03-19
 */
public class Solution
{
    public int countNodes(TreeNode root)
    {
        if (null == root)
        {
        	return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == rightHeight)
        {
        	return (1 << leftHeight) + countNodes(root.right);
        }
        else
        {
        	return (1 << rightHeight) + countNodes(root.left);
        }
    }
    
    public int height(TreeNode node)
    {
    	if (null == node)
    	{
    		return 0;
    	}
    	return 1 + height(node.left);
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * 103. Binary Tree Zigzag Level Order Traversal
 * 
 * @author leo.ch
 * @since  2017-02-26
 */
public class Solution
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
    	List<List<Integer>> order = new ArrayList<List<Integer>>();
    	if (null == root)
    	{
    		return order;
    	}
        List<TreeNode> levelNodes = new ArrayList<TreeNode>();
        levelNodes.add(root);
        boolean ltor = true;
        while (!levelNodes.isEmpty())
        {
        	List<TreeNode> nextLevelNodes = new ArrayList<TreeNode>();
            List<Integer> levelOrder = new ArrayList<Integer>();
        	for (TreeNode levelNode : levelNodes)
        	{
        		if (ltor)
        		{
        			levelOrder.add(levelNode.val);
        		}
        		else
        		{
        			levelOrder.add(0, levelNode.val);
        		}
        		if (levelNode.left != null)
        		{
        			nextLevelNodes.add(levelNode.left);
        		}
        		if (levelNode.right != null)
        		{
        			nextLevelNodes.add(levelNode.right);
        		}
        	}
        	ltor = !ltor;
        	order.add(levelOrder);
        	levelNodes.clear();
        	levelNodes.addAll(nextLevelNodes);
        }
        return order;
    }
}

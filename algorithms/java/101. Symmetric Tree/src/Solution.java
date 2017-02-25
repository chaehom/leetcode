import java.util.LinkedList;
import java.util.Queue;

/**
 * 101. Symmetric Tree
 * 
 * @author leo.ch
 * @since  2017-02-25
 */
public class Solution
{
    public boolean isSymmetric(TreeNode root)
    {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	if (null == root)
    	{
    		return true;
    	}
    	//不管根节点，两个两个入队列
    	queue.add(root.left);
    	queue.add(root.right);
    	while (!queue.isEmpty())
    	{
    		//每次队列出两个
    		TreeNode left = queue.poll();
    		TreeNode right = queue.poll();
    		if (left == null && right == null)
    		{
    			continue;
    		}
    		//左右异或，如果有一边空一边非空，说明不对称
    		else if (left == null ^ right == null)
    		{
    			return false;
    		}
    		else if (left.val != right.val)
    		{
    			return false;
    		}
    		else
    		{
    			//左左右右
    			queue.add(left.left);
    			queue.add(right.right);
    			//左右右左
    			queue.add(left.right);
    			queue.add(right.left);
    		}
    	}
    	return true;
    }
}


/**
 * 104. Maximum Depth of Binary Tree
 * 
 * @author leo.ch
 * @since  2017-02-27
 */
public class Solution {
    public int maxDepth(TreeNode root)
    {
        if (root == null)
        {
        	return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }
}

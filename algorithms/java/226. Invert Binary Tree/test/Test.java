import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 226. Invert Binary Tree
 * 
 * @author leo.ch
 * @since  2017-03-20
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		TreeNode root = makeBinaryTree(nums);
		TreeNode revertNode = solution.invertTree(root);
		int[] expecteds = {1, 3, 2, 7, 6, 5, 4};
		int[] actuals = travelBinaryTree(revertNode);
		assertArrayEquals(expecteds, actuals);
	}

	private TreeNode makeBinaryTree(int[] nums)
	{
		return makeBinaryTree(nums, 0);
	}

	private TreeNode makeBinaryTree(int[] nums, int i)
	{
		if (i >= nums.length || -1 == nums[i])
		{
			return null;
		}
		TreeNode node = new TreeNode(nums[i]);
		node.left = makeBinaryTree(nums, i * 2 + 1);
		node.right = makeBinaryTree(nums, i * 2 + 2);
		return node;
	}
	
	private int[] travelBinaryTree(TreeNode revertNode) {
		List<Integer> order = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(revertNode);
		while (!queue.isEmpty())
		{
			TreeNode node = queue.poll();
			order.add(node.val);
			if (null != node.left)
			{
				queue.offer(node.left);
			}
			if (null != node.right)
			{
				queue.offer(node.right);
			}
		}
		int[] result = new int[order.size()];
		for (int i = 0; i < order.size(); i++)
		{
			result[i] = order.get(i);
		}
		return result;
	}
	
}

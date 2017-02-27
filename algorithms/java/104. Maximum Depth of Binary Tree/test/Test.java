import static org.junit.Assert.*;

/**
 * 104. Maximum Depth of Binary Tree
 * 
 * @author leo.ch
 * @since  2017-02-27
 */
public class Test {

	Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[] nums = {1};
		TreeNode root = makeBinaryTree(nums);
		assertEquals(1, solution.maxDepth(root));
	}

	@org.junit.Test
	public void test2() {
		int[] nums = {1, 2, 3, 4, -1, -1, -1, 8};
		TreeNode root = makeBinaryTree(nums);
		assertEquals(4, solution.maxDepth(root));
	}

	@org.junit.Test
	public void test3() {
		int[] nums = {};
		TreeNode root = makeBinaryTree(nums);
		assertEquals(0, solution.maxDepth(root));
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
}

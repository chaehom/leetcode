import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 101. Symmetric Tree
 * 
 * @author leo.ch
 * @since  2017-02-25
 */
public class Test
{
	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1()
	{
		int[] nums = {1, 2, 2, 3, 4, 4, 3};
		TreeNode root = makeBinaryTree(nums);
		assertTrue(solution.isSymmetric(root));
	}
	
	@org.junit.Test
	public void test2()
	{
		int[] nums = {1, 2, 2, -1, 3, -1, 3};
		TreeNode root = makeBinaryTree(nums);
		assertFalse(solution.isSymmetric(root));
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

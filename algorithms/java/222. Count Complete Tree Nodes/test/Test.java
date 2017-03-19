import static org.junit.Assert.assertEquals;

/**
 * 222. Count Complete Tree Nodes
 * 
 * @author leo.ch
 * @since  2017-03-19
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		int[] treeNums = {1,2,3,4,5,6,7,8,9,10};
		TreeNode root = makeBinaryTree(treeNums);
		
		assertEquals(10, solution.countNodes(root));
	}

	@org.junit.Test
	public void test2() {
		int[] treeNums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		TreeNode root = makeBinaryTree(treeNums);
		
		assertEquals(15, solution.countNodes(root));
	}

	@org.junit.Test
	public void test3() {
		int[] treeNums = {};
		TreeNode root = makeBinaryTree(treeNums);
		
		assertEquals(0, solution.countNodes(root));
	}

	@org.junit.Test
	public void test4() {
		int[] treeNums = {1};
		TreeNode root = makeBinaryTree(treeNums);
		
		assertEquals(1, solution.countNodes(root));
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

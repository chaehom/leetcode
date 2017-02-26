import static org.junit.Assert.*;

import java.util.List;

/**
 * 102. Binary Tree Level Order Traversal
 * 
 * @author leo.ch
 * @since  2017-02-26
 */
public class Test {

/*	@org.junit.Test
	public void test1()
	{
		Solution solution = new Solution();
		int[] treeNums = {3,9,20,-1,-1,15,7};
		TreeNode root = makeBinaryTree(treeNums);
		List<List<Integer>> ans = solution.levelOrder(root);
		int[][] actuals = listToArray(ans); 
		int[][] expecteds = {{3}, {9, 20}, {15, 7}};
		assertArrayEquals(expecteds, actuals);;
	}

	@org.junit.Test
	public void test2()
	{
		Solution solution = new Solution();
		int[] treeNums = {3};
		TreeNode root = makeBinaryTree(treeNums);
		List<List<Integer>> ans = solution.levelOrder(root);
		int[][] actuals = listToArray(ans); 
		int[][] expecteds = {{3}};
		assertArrayEquals(expecteds, actuals);;
	}*/

	@org.junit.Test
	public void test3()
	{
		Solution solution = new Solution();
		int[] treeNums = {};
		TreeNode root = makeBinaryTree(treeNums);
		List<List<Integer>> ans = solution.levelOrder(root);
		int[][] actuals = listToArray(ans); 
		int[][] expecteds = {};
		assertArrayEquals(expecteds, actuals);;
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
	
	private int[][] listToArray(List<List<Integer>> list)
	{
		if (null == list)
		{
			return null;
		}
		int[][] array = new int[list.size()][];
		for (int i = 0; i < list.size(); i++)
		{
			List<Integer> subList = list.get(i);
			array[i] = new int[subList.size()];
			for (int j = 0; j < subList.size(); j++)
			{
				array[i][j] = subList.get(j);
			}
		}
		return array;
	}
}

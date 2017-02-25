import static org.junit.Assert.*;

/**
 * 88. Merge Sorted Array
 * 
 * @author leo.ch
 * @since  2017-02-25
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1()
	{
		int[] expected = {0,1,2,3,4,5,6,7,8,9};
		
		int[] initNums = {1, 3, 5, 7, 9};
		int[] nums1 = new int[10];
		for (int i = 0; i < initNums.length; i++)
		{
			nums1[i] = initNums[i];
		}
		int[] nums2 = {0, 2, 4, 6, 8};
		solution.merge(nums1, 5, nums2, 5);
		assertArrayEquals(expected, nums1);
	}

	@org.junit.Test
	public void test2()
	{
		int[] expected = {1, 3, 5, 7, 9, 10, 12, 14, 16, 18};
		
		int[] initNums = {1, 3, 5, 7, 9};
		int[] nums1 = new int[10];
		for (int i = 0; i < initNums.length; i++)
		{
			nums1[i] = initNums[i];
		}
		int[] nums2 = {10, 12, 14, 16, 18};
		solution.merge(nums1, 5, nums2, 5);
		assertArrayEquals(expected, nums1);
	}

	@org.junit.Test
	public void test3()
	{
		int[] expected = {1, 3, 5, 7, 9, 10, 12, 14, 16, 18};
		
		int[] initNums = {10, 12, 14, 16, 18};
		int[] nums1 = new int[10];
		for (int i = 0; i < initNums.length; i++)
		{
			nums1[i] = initNums[i];
		}
		int[] nums2 = {1, 3, 5, 7, 9};
		solution.merge(nums1, 5, nums2, 5);
		assertArrayEquals(expected, nums1);
	}

	@org.junit.Test
	public void test4()
	{
		int[] expected = {};
		
		int[] nums1 = {};
		int[] nums2 = {};
		solution.merge(nums1, 2, nums2, 0);
		assertArrayEquals(expected, nums1);
	}

	@org.junit.Test
	public void test5()
	{
		int[] expected = {1, 2};
		
		int[] initNums = {1, 2};
		int[] nums1 = new int[2];
		for (int i = 0; i < initNums.length; i++)
		{
			nums1[i] = initNums[i];
		}
		int[] nums2 = {};
		solution.merge(nums1, 2, nums2, 0);
		assertArrayEquals(expected, nums1);
	}

	@org.junit.Test
	public void test6()
	{
		int[] expected = {1, 2};
		
		int[] initNums = {};
		int[] nums1 = new int[2];
		for (int i = 0; i < initNums.length; i++)
		{
			nums1[i] = initNums[i];
		}
		int[] nums2 = {1, 2};
		solution.merge(nums1, 0, nums2, 2);
		assertArrayEquals(expected, nums1);
	}
}

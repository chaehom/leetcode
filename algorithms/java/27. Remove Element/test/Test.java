import static org.junit.Assert.*;

/**
 * 27. Remove Element
 * 
 * @author leo.ch
 * @since  2017-02-12
 */
public class Test {
	
	private Solution solution = new Solution();
	@org.junit.Test
	public void test1() 
	{
		int[] nums = {3, 2, 2, 3};
		assertEquals(2, solution.removeElement(nums, 3));
		assertArrayEquals(new int[]{2, 2, 2, 3}, nums);
	}
	
	@org.junit.Test
	public void test2() 
	{
		assertEquals(0, solution.removeElement(new int[]{1}, 1));
		assertEquals(0, solution.removeElement(new int[]{}, 3));
		assertEquals(2, solution.removeElement(new int[]{1, 2}, 3));
		assertEquals(4, solution.removeElement(new int[]{1, 2, 3, 4, 5}, 3));
	}
	
	@org.junit.Test
	public void test3() 
	{
		int[] nums = {1, 2, 3, 4, 5, 5, 5, 3, 6, 3, 3, 7};
		assertEquals(8, solution.removeElement(nums, 3));
		assertArrayEquals(new int[]{1, 2, 7, 4, 5, 5, 5, 6, 6, 3, 3, 7},  nums);
	}
	
	@org.junit.Test
	public void test4() 
	{
		int[] nums = {1, 2, 3, 4, 5, 5, 5, 3, 6};
		assertEquals(7, solution.removeElement(nums, 3));
		assertArrayEquals(new int[]{1, 2, 6, 4, 5, 5, 5, 3, 6},  nums);
	}

	@org.junit.Test
	public void test5()
	{
		int[] nums = {3, 3};
		assertEquals(0, solution.removeElement(nums, 3));
	}

	@org.junit.Test
	public void test6()
	{
		int[] nums = {2, 3, 3};
		assertEquals(1, solution.removeElement(nums, 3));
		assertArrayEquals(new int[]{2, 3, 3},  nums);
	}

	@org.junit.Test
	public void test7()
	{
		int[] nums = {3, 3, 3, 3, 2};
		assertEquals(1, solution.removeElement(nums, 3));
		assertArrayEquals(new int[]{2, 3, 3, 3, 2},  nums);
	}

}

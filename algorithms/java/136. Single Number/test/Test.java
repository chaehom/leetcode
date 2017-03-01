import static org.junit.Assert.*;

/**
 * 136. Single Number
 * 
 * @author leo.ch
 * @since  2017-03-01
 */
public class Test {

	private Solution solution = new Solution();
	
	@org.junit.Test
	public void test1()
	{
		int[] nums = {1, 2, 1, 2, 3, 4, 5, 3, 5};
		assertEquals(4, solution.singleNumber(nums));
	}
	
	@org.junit.Test
	public void test2()
	{
		int[] nums = {};
		assertEquals(0, solution.singleNumber(nums));
	}
	
	@org.junit.Test
	public void test3()
	{
		int[] nums = {1};
		assertEquals(1, solution.singleNumber(nums));
	}

}

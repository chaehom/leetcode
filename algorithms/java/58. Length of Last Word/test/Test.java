import static org.junit.Assert.*;

/**
 * 58. Length of Last Word
 * 
 * @author leo.ch
 * @since  2017-02-18
 */
public class Test {

	
	@org.junit.Test
	public void test1()
	{
		Solution solution = new Solution();
		assertEquals(5, solution.lengthOfLastWord("Hello World"));
		assertEquals(0, solution.lengthOfLastWord(" "));
		assertEquals(0, solution.lengthOfLastWord(""));
		assertEquals(2, solution.lengthOfLastWord(" hi"));
		assertEquals(2, solution.lengthOfLastWord("hi "));
		assertEquals(2, solution.lengthOfLastWord(" hi "));
	}

}

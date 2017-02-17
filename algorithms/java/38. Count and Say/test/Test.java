import static org.junit.Assert.*;

/**
 * 38. Count and Say
 * 
 * @author leo.ch
 * @since  2017-02-17
 */
public class Test {

	@org.junit.Test
	public void test1() 
	{
		Solution solution = new Solution();
		assertEquals("1", solution.countAndSay(1));
		assertEquals("11", solution.countAndSay(2));
		assertEquals("21", solution.countAndSay(3));
		assertEquals("1211", solution.countAndSay(4));
		assertEquals("111221", solution.countAndSay(5));
		assertEquals("312211", solution.countAndSay(6));
		assertEquals("13112221", solution.countAndSay(7));
		assertEquals("1113213211", solution.countAndSay(8));
		assertEquals("31131211131221", solution.countAndSay(9));
		assertEquals("13211311123113112211", solution.countAndSay(10));
	}

}

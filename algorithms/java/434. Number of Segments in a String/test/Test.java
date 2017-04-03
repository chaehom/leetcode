import static org.junit.Assert.*;

/**
 * 434. Number of Segments in a String
 * 
 * @author leo.ch
 * @since  2017-04-03
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		
		assertEquals(5, solution.countSegments("Hello, my name is John"));
		assertEquals(0, solution.countSegments("  "));
		assertEquals(1, solution.countSegments(",,,,..  "));
		assertEquals(2, solution.countSegments(" a b "));
	}

}

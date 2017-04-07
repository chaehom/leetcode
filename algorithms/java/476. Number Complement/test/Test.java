import static org.junit.Assert.*;

/**
 * 476. Number Complement
 * 
 * @author leo.ch
 * @since  2017-04-07
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(0, solution.findComplement(1));
		assertEquals(2, solution.findComplement(5));
		assertEquals(1, solution.findComplement(2));
		assertEquals(3, solution.findComplement(4));
		assertEquals(0, solution.findComplement(7));
		assertEquals(0, solution.findComplement(Integer.MAX_VALUE));
	}

}

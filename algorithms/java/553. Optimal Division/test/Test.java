import static org.junit.Assert.*;

/**
 * 553. Optimal Division
 * 
 * @author leo.ch
 * @since  2017-04-18
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("1000/(100/10/2)", solution.optimalDivision(new int[]{1000,100,10,2}));
	}

}

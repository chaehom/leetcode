import static org.junit.Assert.*;

/**
 * 55. Jump Game
 * 
 * @author leo.ch
 * @since  2017-02-21
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.canJump(new int[]{2,3,1,1,4}));
		assertFalse(solution.canJump(new int[]{3,2,1,0,4}));
	}

}

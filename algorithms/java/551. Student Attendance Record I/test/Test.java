import static org.junit.Assert.*;

/**
 * 551. Student Attendance Record I
 * 
 * @author leo.ch
 * @since  2017-04-17
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertTrue(solution.checkRecord("PPALLP"));
		assertFalse(solution.checkRecord("PPALLL"));
		assertTrue(solution.checkRecord("LALL"));
	}

}

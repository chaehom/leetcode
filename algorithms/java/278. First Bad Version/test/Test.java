import static org.junit.Assert.*;

/**
 * 278. First Bad Version
 * 
 * @author leo.ch
 * @since  2017-02-16
 */
public class Test {

	@org.junit.Test
	public void test1() {
		Solution solution = new Solution();
		solution.firstBadVersion = 5;
		assertEquals(solution.firstBadVersion, solution.firstBadVersion(10));
	}

	@org.junit.Test
	public void test2() {
		Solution solution = new Solution();
		solution.firstBadVersion = 1;
		assertEquals(solution.firstBadVersion, solution.firstBadVersion(10));
	}

	@org.junit.Test
	public void test3() {
		Solution solution = new Solution();
		solution.firstBadVersion = 3;
		assertEquals(solution.firstBadVersion, solution.firstBadVersion(3));
	}

	@org.junit.Test
	public void test4() {
		Solution solution = new Solution();
		solution.firstBadVersion = 7;
		assertEquals(solution.firstBadVersion, solution.firstBadVersion(8));
	}

	@org.junit.Test
	public void test5() {
		Solution solution = new Solution();
		solution.firstBadVersion = 2;
		assertEquals(solution.firstBadVersion, solution.firstBadVersion(10));
	}

}

import static org.junit.Assert.*;

/**
 * 71. Simplify Path
 * 
 * @author leo.ch
 * @since  2017-02-21
 */
public class Test {

	
	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("/", solution.simplifyPath(""));
		assertEquals("/", solution.simplifyPath("/"));
		assertEquals("/", solution.simplifyPath("/../"));
		assertEquals("/a", solution.simplifyPath("/a"));
		assertEquals("/a/b", solution.simplifyPath("/a/b/"));
		assertEquals("/a/b", solution.simplifyPath("/a/b/"));
		assertEquals("/home", solution.simplifyPath("/home/"));
		assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
		assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
	}

}

import java.util.List;

/**
 * 119. Pascal's Triangle II
 * 
 * @author leo.ch
 * @since  2017-03-12
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		List<Integer> row = solution.getRow(10);
		for (int num : row)
		{
			System.out.print(num + " ");
		}
	}

}

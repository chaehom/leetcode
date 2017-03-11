import java.util.List;

/**
 * 118. Pascal's Triangle
 * 
 * @author leo.ch
 * @since  2017-03-12
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		List<List<Integer>> rows = solution.generate(0);
		for (List<Integer> row : rows)
		{
			for (Integer num : row)
			{
				System.out.print(num + " ");
			}
			System.out.println("");
		}
	}

}

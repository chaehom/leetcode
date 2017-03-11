import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * 
 * @author leo.ch
 * @since  2017-03-12
 */
public class Solution
{
	public List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		for (int rowNo = 1; rowNo <= numRows; rowNo++)
		{
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			if (rowNo > 1)
			{
				List<Integer> lastRow = triangle.get(rowNo-2);
				for (int k = 0; k < lastRow.size(); k++)
				{
					int next = 0;
					if (k + 1 < lastRow.size())
					{
						next = lastRow.get(k + 1);
					}
					row.add(lastRow.get(k) + next);
				}
			}
			triangle.add(row);
		}
        return triangle;
    }
}

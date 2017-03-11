import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * 
 * @author leo.ch
 * @since  2017-03-12
 */
public class Solution
{
    public List<Integer> getRow(int rowIndex)
    {
    	List<Integer> row = new ArrayList<Integer>();
    	for (int i = 0; i <= rowIndex; i++)
    	{
    		row.add(0, 1);
    		for (int j = 1; j < row.size() - 1; j++)
    		{
    			row.set(j, row.get(j) + row.get(j + 1));
    		}
    	}
    	return row;
    }
}

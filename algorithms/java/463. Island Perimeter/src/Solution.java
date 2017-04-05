
/**
 * 463. Island Perimeter
 * 
 * @author leo.ch
 * @since  2017-04-05
 */
public class Solution
{
    public int islandPerimeter(int[][] grid)
    {
        int height = grid.length;
        int width = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i < height; i++)
        {
        	for (int j = 0; j < width; j++)
        	{
        		if (grid[i][j] == 1)
        		{
        			perimeter += 4;
        			if (i < height - 1 && grid[i+1][j] == 1)
        			{
        				perimeter-=2;
        			}
        			if (j < width - 1 && grid[i][j+1] == 1)
        			{
        				perimeter-=2;
        			}
        		}
        	}
        }
        return perimeter;
    }
}

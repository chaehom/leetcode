
/**
 * 36. Valid Sudoku
 * 
 * @author leo.ch
 * @since  2017-02-18
 */
public class Solution
{
    public boolean isValidSudoku(char[][] board)
    {
    	int[] seen = new int[300];
    	for (int i = 0; i < 9; i++)
    	{
    		for (int j = 0; j < 9; j++)
    		{
    			if (board[i][j] != '.')
    			{
    				int num = board[i][j] - '0';
    		    	//0xk 表示x在k块
    				int box = num * 10 + i / 3 * 3 + j / 3;
    				//1xi 表示x在i行
    				int row = 100 + num * 10 + i;
    				//2xj 表示x在j列
    				int column = 200 + num * 10 + j;
    				if (seen[box] != 1 && seen[row] != 1 && seen[column] != 1)
    				{
	    				seen[box] = 1;
	    				seen[row] = 1;
	    				seen[column] = 1;
    				}
    				else
    				{
    					return false;
    				}
    			}
    		}
    	}
        return true;
    }
}

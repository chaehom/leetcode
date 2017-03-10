
/**
 * 79. Word Search
 * 
 * @author leo.ch
 * @since  2017-03-10
 */
public class Solution
{
    public boolean exist(char[][] board, String word)
    {
    	for (int i = 0; i < board.length; i++)
    	{
    		for (int j = 0; j < board[0].length; j++)
    		{
    			if (board[i][j] == word.charAt(0))
    			{
    				if (track(board, i, j, word, 0, new boolean[board.length][board[0].length]))
    				{
    					return true;
    				}
    			}
    		}
    	}
        return false;
    }

	private boolean track(char[][] board, int i, int j, String word, int idx, boolean[][] visited)
	{
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] == true)
		{
			return false;
		}

		if (board[i][j] != word.charAt(idx))
		{
			return false;
		}

		if (idx + 1 == word.length())
		{
			return true;
		}
		else
		{
			idx++;
		}

		visited[i][j] = true;
		if(track(board, i, j + 1, word, idx, visited)
			|| track(board, i, j - 1, word, idx, visited)
			|| track(board, i - 1, j, word, idx, visited)
			|| track(board, i + 1, j, word, idx, visited))
		{
			return true;
		}
		visited[i][j] = false;
		return false;
	}
}

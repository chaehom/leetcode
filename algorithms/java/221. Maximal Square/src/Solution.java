
/**
 * 221. Maximal Square
 * 
 * @author leo.ch
 * @since  2017-03-19
 */
public class Solution
{
    public int maximalSquare(char[][] matrix)
    {
    	if (null == matrix || matrix.length == 0 || matrix[0].length == 0)
    	{
    		return 0;
    	}
    	int m = matrix.length;
    	int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        
        int max = 0;
        for (int i = 1; i <= m; i++)
        {
        	for (int j = 1; j <= n; j++)
        	{
        		if (matrix[i - 1][j - 1] == '1')
        		{
        	        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
        	        max = Math.max(max, dp[i][j]);
        		}
        	}
        }
        return max * max;
    }
}

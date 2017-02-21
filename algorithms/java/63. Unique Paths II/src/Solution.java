
/**
 * 63. Unique Paths II
 * 
 * @author leo.ch
 * @since  2017-02-21
 */
public class Solution
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
    	{
    		return 0;
    	}
    	
    	int[][] dp = new int[m][n];
    	dp[0][0] = 1;
    	for (int i = 1, path = 1; i < m; i++)
    	{
    		if (obstacleGrid[i][0] == 1)
    		{
    			path = 0;
    		}
    		dp[i][0] = path;
    	}
    	for (int i = 1, path = 1; i < n; i++)
    	{
    		if (obstacleGrid[0][i] == 1)
    		{
    			path = 0;
    		}
    		dp[0][i] = path;
    	}
    	
    	for (int i = 1; i < m; i++)
    	{
    		for (int j = 1; j < n; j++)
    		{
    			if (obstacleGrid[i][j] == 1)
    			{
    				dp[i][j] = 0;
    			}
    			else
    			{
    				dp[i][j] = dp[i-1][j] + dp[i][j-1];
    			}
    		}
    	}
    	
        return dp[m-1][n-1];
    }
}
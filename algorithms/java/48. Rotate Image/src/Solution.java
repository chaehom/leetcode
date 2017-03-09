/**
 * 48. Rotate Image
 * 
 * @author leo.ch
 * @since  2017-03-09
 */
public class Solution
{
    public void rotate(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
        	for (int j = 0; j < i; j++)
        	{
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = tmp;
        	}
        }
        for (int i = 0; i < matrix.length; i++)
        {
        	for (int j = 0, k = matrix.length-1-j; j <= k; j++, k--)
        	{
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[i][k];
        		matrix[i][k] = tmp;
        	}
        }
    }
}

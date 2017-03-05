
/**
 * 135. Candy
 * 
 * @author leo.ch
 * @since  2017-03-05
 */
public class Solution
{
    public int candy(int[] ratings)
    {
        int[] candy = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++)
        {
        	candy[i] = 1;
        }
        
        for (int i = 1; i < ratings.length; i++)
        {
        	if (ratings[i] > ratings[i - 1])
        	{
        		candy[i] = candy[i-1] + 1;
        	}
        }
        
        int cnt = 0;
        for (int i = ratings.length - 1; i > 0; i--)
        {
        	if (ratings[i - 1] > ratings[i] && candy[i - 1] <= candy[i])
        	{
        		candy[i - 1] = candy[i] + 1;
        	}
        	cnt += candy[i];
        }
        return cnt + candy[0];
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 218. The Skyline Problem
 * 
 * @author leo.ch
 * @since  2017-03-19
 */
public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
    	Set<Integer> criticalPoints = new TreeSet<Integer>();
    	for (int i = 0; i < buildings.length; i++)
    	{
    		criticalPoints.add(buildings[i][0]);
    		criticalPoints.add(buildings[i][1]);
    	}

    	List<int[]> skyline = new ArrayList<int[]>();
    	int preHeight = 0;
    	for (int cp : criticalPoints)
    	{
    		int maxHeight = 0;
    		for (int i = 0; i < buildings.length; i++)
    		{
    			if (cp >= buildings[i][0] && cp < buildings[i][1])
    			{
    				maxHeight = Math.max(buildings[i][2], maxHeight);
    			}
    		}
    		
    		if (preHeight != maxHeight)
    		{
	    		int[] keyPoint = {cp, maxHeight};
	    		//System.out.println(keyPoint[0] + " " + keyPoint[1]);
	    		skyline.add(keyPoint);
	    		preHeight = maxHeight;
    		}
    	}
        return skyline;
    }
}

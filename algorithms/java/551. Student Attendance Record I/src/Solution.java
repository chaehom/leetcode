
/**
 * 551. Student Attendance Record I
 * 
 * @author leo.ch
 * @since  2017-04-17
 */
public class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        for (char c : s.toCharArray())
        {
        	if (c == 'A')
        	{
        		a++;
        	}
        }
        return !(a > 1 || -1 != s.indexOf("LLL"));
    }
}

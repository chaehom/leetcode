
/**
 * 434. Number of Segments in a String
 * 
 * @author leo.ch
 * @since  2017-04-03
 */
public class Solution {
    public int countSegments(String s) {
        return ("x " + s).split(" +").length - 1;
    }
}

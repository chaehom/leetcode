
/**
 * 520. Detect Capital
 * 
 * @author leo.ch
 * @since  2017-04-10
 */
public class Solution {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}

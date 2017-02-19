import static org.junit.Assert.*;

/**
 * 67. Add Binary
 * 
 * @author leo.ch
 * @since  2017-02-19
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("100", solution.addBinary("11", "1"));
		assertEquals("0", solution.addBinary("0", "0"));
		assertEquals("1", solution.addBinary("1", "0"));
		assertEquals("10", solution.addBinary("1", "1"));
		assertEquals("11110",solution.addBinary("1111", "1111"));
		assertEquals("100000000000000000000000000000000", solution.addBinary("11111111111111111111111111111111", "1"));
		assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000", 
				solution.addBinary( "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
								"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}

}

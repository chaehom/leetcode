import static org.junit.Assert.*;

/**
 * 468. Validate IP Address
 * 
 * @author leo.ch
 * @since  2017-04-06
 */
public class Test {

	@org.junit.Test
	public void test() {
		Solution solution = new Solution();
		assertEquals("IPv4", solution.validIPAddress("127.0.0.1"));
		assertEquals("IPv4", solution.validIPAddress("172.16.254.1"));
		assertEquals("Neither", solution.validIPAddress("172.16.254.01"));
		assertEquals("Neither", solution.validIPAddress("256.256.256.256"));
		assertEquals("IPv6", solution.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
		assertEquals("IPv6", solution.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
		assertEquals("Neither", solution.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
		assertEquals("Neither", solution.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
		assertEquals("Neither", solution.validIPAddress("123"));
	}

}

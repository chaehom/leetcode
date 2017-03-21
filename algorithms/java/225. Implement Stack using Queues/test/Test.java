import static org.junit.Assert.*;

/**
 * 225. Implement Stack using Queues
 * 
 * @author leo.ch
 * @since  2017-03-21
 */
public class Test {

	@org.junit.Test
	public void test() {
		MyStack myStack = new MyStack();
		assertTrue(myStack.empty());
		
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		
		assertFalse(myStack.empty());
		assertEquals(3, myStack.top());
		assertEquals(3, myStack.pop());
		assertEquals(2, myStack.top());
		assertEquals(2, myStack.pop());
		
		assertFalse(myStack.empty());
		assertEquals(1, myStack.top());
		assertEquals(1, myStack.pop());
		assertTrue(myStack.empty());
	}

}

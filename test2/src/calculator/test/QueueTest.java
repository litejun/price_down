package calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.ArrayQueue;

public class QueueTest {

	@Test
	public void test() {
		ArrayQueue queue = new ArrayQueue(5);
		System.out.println(queue.full());
		
		queue.insert('a');
		queue.insert('b');
		queue.insert('c');
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		
	}

}

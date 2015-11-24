package calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.LinkedList;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		assertEquals(10,numbers.head.data);
	}

}

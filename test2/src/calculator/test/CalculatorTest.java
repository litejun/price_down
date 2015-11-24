package calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator calculator = new Calculator();
		assertEquals(20, calculator.sum(10,20));
		
	}

}

package calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.ArrayStack;

public class StackTest {

	@Test
	public void test() {
        ArrayStack arrayStack = new ArrayStack(5);
        System.out.println("Array Stack �׽�Ʈ");
        for(int i=1; i<=5; i++){
            arrayStack.push("ArrayStack ������-" + i);
        }
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    
        System.out.println();
        
	}

}

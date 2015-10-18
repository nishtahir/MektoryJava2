package ee.ttu.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int num1 = 5;
		int num2 = 10;
		
		int result = calc.add(num1, num2);
		int correctAnswer = 15;
		assertEquals(correctAnswer, result);
	}
	
	@Test
	public void testSub(){
		Calculator calc = new Calculator();
		int num1 = 5;
		int num2 = 10;
		
		int result = calc.sub(num1, num2);
		int correctAnswer = -5;
		assertEquals(correctAnswer, result);

	}

}

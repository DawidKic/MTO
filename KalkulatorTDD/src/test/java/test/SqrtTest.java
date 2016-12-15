package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;

public class SqrtTest {
	
	Calculator calculator;
	
	@Before
	public void Create()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void SqrtTestPositiveIntegerResult(){
		int testSqrt = 3;
		System.out.println("@Test sqrt positive");
		assertEquals(testSqrt, calculator.sqrt(9));
	}
	
	@Test(expected = ArithmeticException.class)
	public void SqrtTestNegative(){
		System.out.println("@Test sqrt negative");
		calculator.sqrt(-9);
	}
	
	@Test
	public void SqrtTestZero(){
		int testSqrt = 0;
		System.out.println("@Test sqrt of zero");
		assertEquals(testSqrt, calculator.sqrt(0));
	}

}

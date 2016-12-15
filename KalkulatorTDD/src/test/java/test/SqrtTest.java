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

}

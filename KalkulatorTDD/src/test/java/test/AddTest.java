package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import calculator.Calculator;

public class AddTest {
	Calculator calculator;
	@Before
	public void Create()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void AddTestPositive(){
		int testSum = 4;
		System.out.println("@Test add positive");
		assertEquals(testSum, calculator.add(1,3));
	}
	
	@Test
	public void SumTestOneNegative(){
		int testSum = -2;
		System.out.println("@Test add one negative");
		assertEquals(testSum, calculator.add(1,-3));
	}
	
	@Test
	public void SumTestTwoNegatives(){
		int testSum = -4;
		System.out.println("@Test add one negative");
		assertEquals(testSum, calculator.add(-1,-3));
	}

}

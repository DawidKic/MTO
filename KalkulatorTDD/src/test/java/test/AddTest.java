package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import calculator.Calculator;

public class AddTest {
	Calculator calculator;

	@Before
	public void Create() {
		calculator = new Calculator();
	}

	@Test
	public void addTestPositive() {
		int testSum = 4;
		System.out.println("@Test add positive");
		assertEquals(testSum, calculator.add(1, 3));
	}
	
	@Test
	public void sumTestOneNegative(){
		int testSum = -2;
		System.out.println("@Test add one negative");
		assertEquals(testSum, calculator.add(1,-3));
	}
	
	@Test
	public void sumTestTwoNegatives(){
		int testSum = -4;
		System.out.println("@Test add two negatives");
		assertEquals(testSum, calculator.add(-1,-3));
	}
	
	@Test(expected=ArithmeticException.class)
	public void overflowTestMax()
	{
		System.out.println("@Test add maximum overflow");
		calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	
	@Test(expected=ArithmeticException.class)
	public void overflowTestMin()
	{
		System.out.println("@Test add minimum overflow");
		calculator.add(Integer.MIN_VALUE, Integer.MIN_VALUE);
	}
	

}

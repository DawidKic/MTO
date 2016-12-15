package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;

public class DivTest {

	Calculator calculator;

	@Before
	public void Create() {
		calculator = new Calculator();
	}

	@Test
	public void divTestPositive() {
		int testDiv = 2;
		System.out.println("@Test divide positive");
		assertEquals(testDiv, calculator.div(4, 2));
	}

	@Test
	public void divTestDividendNegative() {
		int testDiv = -2;
		System.out.println("@Test dividedend negative");
		assertEquals(testDiv, calculator.div(-4, 2));
	}

	@Test
	public void divTestDivisorNegative() {
		int testDiv = -2;
		System.out.println("@Test divisor negative");
		assertEquals(testDiv, calculator.div(4, -2));
	}

	@Test
	public void divTestNegative() {
		int testDiv = 2;
		System.out.println("@Test both negative");
		assertEquals(testDiv, calculator.div(-4, -2));
	}

	@Test
	public void divTestDividendZero() {
		int testDiv = 0;
		System.out.println("@Test dividend zero");
		assertEquals(testDiv, calculator.div(0, -2));
	}

	@Test(expected = ArithmeticException.class)
	public void divTestDivisorZero() {
		System.out.println("@Test divisor zero");
		calculator.div(5, 0);
	}

	@Test(expected = ArithmeticException.class)
	public void divTestFloorDivSpecialCase() {
		System.out.println("@Test floorDiv special case");
		calculator.div(Integer.MIN_VALUE, -1);
	}

	@Test
	public void divTestDividendMinValue() {
		int testDiv = Integer.MIN_VALUE / -2;
		System.out.println("@Test dividend minimum value");
		assertEquals(testDiv, calculator.div(Integer.MIN_VALUE, -2));
	}

	@Test
	public void divTestDivisorMinValue() {
		int testDiv = -2;
		System.out.println("@Test divisor -1");
		assertEquals(testDiv, calculator.div(2, -1));
	}

}

package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;

public class RandTest {
	Calculator calculator;

	@Before
	public void Create() {
		calculator = new Calculator();
	}

	@Test
	public void RandTestRangeCheck() {
		int testRandMax = 2;
		int testRandMin = 0;
		int testSample = calculator.rand(1, 2);
		System.out.println("@Test rand range check");
		assertTrue((testRandMax > testSample) && (testRandMin < testSample));
	}

	@Test
	public void RandTestPositive() {
		int testRand = 100;
		System.out.println("@Test rand positive");
		assertEquals(testRand, calculator.rand(100, 100));
	}

	@Test
	public void RandTestNegative() {
		int testRand = -100;
		System.out.println("@Test rand negative");
		assertEquals(testRand, calculator.rand(-100, -100));
	}

	@Test
	public void RandTestRangeCheckNegativeToPositive() {
		int testRandMax = 101;
		int testRandMin = 0;
		int testSample = calculator.rand(-100, 100);
		System.out.println("@Test rand range check");
		assertTrue((testRandMax > testSample) && (testRandMin < testSample));
	}

}

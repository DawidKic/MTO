package test;

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
	public void SqrtTestPositiveIntegerResult() {
		int testRand = 101;
		System.out.println("@Test sqrt positive");
		assertTrue(testRand > calculator.rand(0, 100));
	}

}

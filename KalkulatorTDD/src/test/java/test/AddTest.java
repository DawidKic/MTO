package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {
	Calculator calculator = new Calculator();
	int sum = calculator.add(1,3);
	int testSum = 5;
	@Test
	public void SumTest(){
		System.out.println("@Test add positive: " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}

}

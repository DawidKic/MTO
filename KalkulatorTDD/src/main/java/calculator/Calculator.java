package calculator;

public class Calculator {
	// dodawanie
	public int add(int a, int b) {
		return Math.addExact(a, b);
	}

	// dzielenie
	public int div(int a, int b) {
		if (a == Integer.MIN_VALUE && b == -1) {
			throw new ArithmeticException();
		}
		return Math.floorDiv(a, b);
	}

	// pierwiastek
	public int sqrt(int a) {
		if (a < 0) {
			throw new ArithmeticException();
		}
		return (int) Math.sqrt(a);
	}

	// random
	public int rand(int a, int b) {
		return (int) (Math.random() * (a - b) + b);
	}

}

package calculator;

public class Calculator {
	//dodawanie
	public int add(int a, int b) {
		return Math.addExact(a, b);
	}
	//dzielenie
	public int div(int a, int b){
		if (a == Integer.MIN_VALUE && b == -1)
		{
			throw new ArithmeticException();
		}
		return Math.floorDiv(a, b);
	}

}

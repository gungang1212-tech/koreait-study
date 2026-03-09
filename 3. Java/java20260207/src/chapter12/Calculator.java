package chapter12;

public class Calculator implements Calculatorable {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int minus(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}

	@Override
	public int mul(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}









package chapter12;

public class Ex01 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int result = c.add(1, 1);
		System.out.println("1 + 1 = " + result);
		
		Object o = new Calculator();
		
		Calculatorable i = new Calculator();
		int result2 = i.add(1, 1);
		System.out.println("1 + 1 = " + result2);
		
	}
}









package chapter13;

public class Ex04 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println("1");
		
		try {
			int result = c.div(3, 0);
			
			System.out.println("4");
			
			System.out.println("나눈 결과 = " + result);
		} catch(ArithmeticException e) {
			System.out.println("던져 받음");
		}
	}
}

package chapter08;

public class Ex03 {
	public static void main(String[] args) {
		Sample03 s = new Sample03();
		
		int number = 1;
		
		System.out.println("number변수에 들어있는 값 = " + number);
		
		s.func1(number);
		
		System.out.println("number변수에 들어있는 값 = " + number);
	}
}

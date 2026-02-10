package chapter08;

public class Ex01 {
	public static void main(String[] args) {
		Sample01 s = new Sample01();
		
		// s 안에 들어있는 메서드를 활용해서 두 수의 합을 화면에 출력해보세요.
//		s.printAddTwoNumbers(1, 1);
		System.out.println("1 + 1 = " + s.returnAddTwoNumbers(1, 1));
		
		// 1 + 2 + 6 + 4 + 10 + 10 + 11 + 24 + 578 + 112 + ... 의 합을 화면에 출력하세요.
//		s.printAddTwoNumbers(9, 14);
		
		int result1 = s.returnAddTwoNumbers(1, 2);
		int result2 = s.returnAddTwoNumbers(6, 4);
		int result3 = s.returnAddTwoNumbers(result1, result2);
		int finalResult = s.returnAddTwoNumbers(result3, 10);
		
		System.out.println(finalResult);
		
		
		s.func2();
	}
}








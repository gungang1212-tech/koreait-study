package chapter08;

public class Sample01 {
	// 두 수를 전달 받아서 전달 받은 두 수의 합을 화면에 출력하는 메서드
	void printAddTwoNumbers(int su1, int su2) {
		int result = su1 + su2;
		
		System.out.println(su1 + " + " + su2 + " = " + result);
	}
	
	// 두 수를 전달 받아서 전달 받은 두 수의 합을 반환하는 메서드
	int returnAddTwoNumbers(int number1, int number2) {
		int result = number1 + number2;
		
		return result;
	}
	
	
	// 아무것도 없는 메서드
	void func1() {
		System.out.println("반환값이 없는 메서드");
	}
	
	int func2() {
		System.out.println("반환값이 있는 메서드");
		
		return 1;
	}
}

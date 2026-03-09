package chapter13;

public class Ex01 {
	public static void main(String[] args) {
		int su1 = 5;
		int su2 = 0;

		try {
			int result = su1 / su2;
			
			System.out.println(su1 + " / " + su2 + " = " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}

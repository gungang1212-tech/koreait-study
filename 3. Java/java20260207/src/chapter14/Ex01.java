package chapter14;

public class Ex01 {
	public static void main(String[] args) {
		int var = 1;
		
		Integer o1 = Integer.valueOf(var);
		
		// 3.14 를 래퍼 클래스로 감싸서 o2 객체에 저장하세요.
		Double o2 = Double.valueOf(3.14);
		
		int var2 = o1.intValue();
		
		// o2 객체에 들어있는 값을 래핑을 풀어서 var3 변수에 저장하세요.
		double var3 = o2.doubleValue();
		
	}
}









package kr.co.koreait;

public class Ex02_Operator {

	public static void main(String[] args) {
		// 연산자 (Operator)
		// 	- 수학적 계산이나 데이터 처리를 수행하가ㅣ 위해 사용하는 기호 또는 기호 조합
		
		// 1. 산술 연산자
		//	+ : 더하기
		// 	- : 빼기
		//	* : 곱하기
		
		System.out.println(10/2);
		System.out.println(10%2);
		
		System.out.println("증감연산자---------------------------");
		
		// 2. 증감 연산자
		// - 피 연산자를 1 증가 또는 감소 시킴
		
		int number = 10;
		System.out.println(number);
		number++;
		System.out.println(number);
		
		// 전위
		// - 피연산자의 값을 먼저 증가 또는 감소 시킨 후 연산을 수행
		int x = 10;
		// x = x+1;
		System.out.println("전위 연산자 : " + ++ x);  
		System.out.println("x의 값 ; " + x);
		// 후위
		// - 연산을 먼저 수행한 후 피연산자의 값을 증가 또는 감소
		int y = 10;
	
		System.out.println("후의 연산자 :" + y++);
		System.out.println("x의 값: "+y);
		
		System.out.println("---- 비교 연산자 -----");
		//3. 비교 연산자
//				a == b :a 와b가 같다
//				a != b : a와 b가 같지 않다
//				a < b : a가 b보다 작다(미만)
//				a <= b : a가 b보다 작거나 같다(이하)
//				a >b : a가 b보다 크다(초과)
//				a >= b : a가 b보다 크거나 같다 (이상)
		
		String str1 = "ABC";
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2); // 주소값 비교이기 때문에 false
		System.out.println(str1.equals(str2)); //문자열 비교이기 때문에 true
		String str3 = "가나다라"; // str3이 비워져 있으면 true
		System.out.println(!"".equals(str1)); // str3이 비워져 있지 않으면 true
		//4.논리부정연산자
		// -true면 false를 반환하고 false면 true를 반환
		//	- 논리(true/false)를 부정하는 연산자
		
		System.out.println("-----논리 연산자----");
		// 5. 논리 연산자
		// - 논리식으로 판단하여 참(TRUE)또는 거짓(FALSE) 반환
		
		// && : 두 피연산자가 모두 참(true)일 때 true 반환
		// || : 두 피연산자 중 하나라도 참(true)일 때 true 반환
		System.out.println(10 < 5 && 20== 20);
		System.out.println(33 > 28 && 5 != 7);
		
		System.out.println(10 < 5 || 20 == 20);
		System.out.println(33 > 28 || 5 != 7);
		
		System.out.println("----복합 대입 연산자-----");
		// 6. 복합 대입 연산자
		// - 대입 연산자(=)와 산술 연산자(+, - , *, /) 등
		
		
		 int sum = 0;
		 sum += 10;
		 
		 System.out.print(sum);
		
	}

}

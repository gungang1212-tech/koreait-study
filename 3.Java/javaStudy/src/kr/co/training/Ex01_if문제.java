package kr.co.training;

import java.util.Scanner;

public class Ex01_if문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		// 1번 문제 :
//		
//		int score = sc.nextInt();
//		if(score >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//		
//		// 2번 문제 :
//		
//		int evenOdd = sc.nextInt();
//		
//		if(evenOdd % 2 == 0) {
//			System.out.printf("%d는 짝수입니다.",evenOdd);
//			System.out.println();
//		} else {
//			System.out.printf("%d는 홀수입니다.", evenOdd);
//		}
//		
//		//3번 문제 :
//		
//		int age = sc.nextInt();
//		
//		if(age >= 20) {
//			System.out.println("성인");
//		} else {
//			System.out.println("미성년자");
//		}
//		
//		// 4번 문제 :
//		
//		int password = sc.nextInt();
//		
//		if( password == 1234 ) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
//		
////		7번 문제 :
//		
//		int age2 = sc.nextInt();
//		
//		if(age2 <= 12) {
//			System.out.println("3000원입니다.");
//		} else if ( age2 <= 18) {
//			System.out.println("5000원입니다.");
//		} else {
//			System.out.println("10000원입니다.");
//		}
		
//		sc.nextLine();
//		
////		8번 문제 :
//		
//		String ID = sc.nextLine();
//		
//		int password2 = sc.nextInt();
//		
//		if( ID.equals("admin") && password2 == 1234) {
//			System.out.println(" 관리자 로그인 성공 ");
//		} 	
//		
//		//9번 문제 :
//		
//		int score2 = sc.nextInt();
//		boolean attendance = sc.nextBoolean();
//		
//		if( attendance == false ) {
//			System.out.println("F");
//		} else if( score2 >= 90) {
//			System.out.println("A");
////		} else if( score2 >= 80 ) {
//			System.out.println("B");
//		} else if( score2 >= 70 ){
//			System.out.println("C");
//		}
		
		//10번 문제 :
		
		 int calender = sc.nextInt();
		 
	  	 if( calender >= 3 && calender <=5 ) {
			 System.out.println("봄");
		 } else if( calender >= 6 && calender <= 8) {
			 System.out.println("여름");
		 } else if (calender >= 9 && calender <= 11) {
			 System.out.println("가을");
		 } else if (calender == 12 || calender == 1 || calender ==2) {
			 System.out.println("겨울");
		 } else {
			 System.out.println("해당하는 계절이 없습니다.");
		 }
	}
}

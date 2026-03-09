package chapter13;

import java.util.InputMismatchException;

public class Ex03 {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			
			if() {
				throw new InputMismatchException();
			}
		} catch(MyException e) {
			System.out.println("내가 만든 예외가 발생했습니다.");
		}
	}
}

package chapter13;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {1, 2, 3, 4};
		
		try {
			System.out.print("인덱스 번호 >> ");
			int index = scanner.nextInt();
			
			System.out.println("array[" + index + "] = " + array[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 번호가 잘못됐습니다.");
		} catch(InputMismatchException e) {
			System.out.println("인덱스 번호는 정수여야합니다.");
		}
	}
}














package chapter12;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		final int VIDEO = 1;
		final int MUSIC = 2;
		final int EXIT = 3;
		
		final int PLAY = 1;
		final int STOP = 2;
		
		Scanner scanner = new Scanner(System.in);
		
		Player player;
		
		while(true) {
			System.out.println("재생 할 대상의 유형을 선택하세요.");
			System.out.println("1. 동영상");
			System.out.println("2. 음악");
			System.out.println("3. 프로그램 종료");
			System.out.print("번호 입력 >> ");
			int menu = scanner.nextInt();
			
			if(menu == VIDEO) {
				player = new VideoPlayer();
			} else if(menu == MUSIC) {
				player = new MusicPlayer();
			} else if(menu == EXIT) {
				break;
			} else {
				System.out.println("번호를 잘못 눌렀습니다.");
				continue;
			}
			
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 재생");
			System.out.println("2. 정지");
			System.out.println("3. 일시정지");
			System.out.println("4. 소리 크게");
			System.out.print("번호 입력 >> ");
			menu = scanner.nextInt();
			
			if(menu == PLAY) {
				player.play();
			} else if(menu == STOP) {
				player.stop();
			} 
		}
	}
}









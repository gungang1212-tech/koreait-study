package chapter09;

public class Ex08 {
	public static void main(String[] args) {
		Menu menu1 = new Menu();
		menu1.setName("짜장면");
		menu1.setPrice(8000);
		
		Menu menu2 = new Menu();
		menu2.setName("짬뽕");
		menu2.setPrice(9000);
		
		System.out.println("메뉴명 = " + menu1.getName());
		System.out.println("메뉴 가격 = " + menu1.getPrice());
		
		System.out.println("메뉴명 = " + menu2.getName());
		System.out.println("메뉴 가격 = " + menu2.getPrice());
	}
}






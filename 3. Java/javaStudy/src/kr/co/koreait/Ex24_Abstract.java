package kr.co.koreait;

import java.util.ArrayList;
import java.util.List;

public class Ex24_Abstract {
	
	public static void main(String[] args) {
		Ex24_1_PineapplePhone p = new Ex24_1_PineapplePhone(); 
		p.powerOn();
		
		Ex24_2_Phone p2 = new Ex24_2_PineapplePhone();
		
		p2.openingLogo();
		p2.powerOn();
		p2.powerOff();
		System.out.println(Ex24_2_PineapplePhone.MAX_BATTERY_CAPACITY);
		
	}

}

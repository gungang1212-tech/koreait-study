package chapter12;

public class Ex02 {
	public static void main(String[] args) {
//		SampleClass1 c = new SampleClass1();
//		
//		c.func1();
//		
//		c.func2();
		
		SampleClass2 c2 = new SampleClass2();
		
		c2.func2();
		
		SampleClass1 c1 = c2;
		
		c1.func2();
	}
}









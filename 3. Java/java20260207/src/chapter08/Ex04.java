package chapter08;

public class Ex04 {
	public static void main(String[] args) {
		Sample03 s = new Sample03();
		
		int[] arr = {1, 2, 3};
		
		System.out.println("arr의 0번 인덱스의 데이터 = " + arr[0]);
		
		s.func2(arr);
		
		System.out.println("arr의 0번 인덱스의 데이터 = " + arr[0]);
	}
}

package chapter08;

public class Ex02 {
	public static void main(String[] args) {
		Sample02 s = new Sample02();
		
		ScoreInfo scoreInfo = s.returnScoreInfo(1, 2, 3);
		
		System.out.println("합계 = " + scoreInfo.total);
		System.out.println("평균 = " + scoreInfo.avg);
	}
}

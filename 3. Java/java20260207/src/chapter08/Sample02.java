package chapter08;

public class Sample02 {
	String returnEvenOrOdd(int number) {
		if(number % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	int 메서드명(int number) {
		int sum = 2;
		
		for(int nthNumber=4; nthNumber<=number; nthNumber=nthNumber+2) {
			sum = sum + nthNumber;
		}
		
		return sum;
	}
	
	ScoreInfo returnScoreInfo(int kor, int eng, int mat) {
		int total = kor + eng + mat;
		double avg = total / (double) 3;
		
		ScoreInfo s = new ScoreInfo();
		s.total = total;
		s.avg = avg;
		
		return s;
	}
}

















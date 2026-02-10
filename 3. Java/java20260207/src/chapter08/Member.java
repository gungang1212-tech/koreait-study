package chapter08;

public class Member {
	String id;
	String pw;
	String tel;
	
	// 회원 정보(아이디, 비밀번호, 연락처)를 전달 받아서
	// 저장하고
	// 저장된 정보를 화면에 출력하는 메서드
	void printMemberInfo(String id, String pw, String tel) {
		Member m = new Member();
		
		m.id = id;
		m.pw = pw;
		m.tel = tel;
		
		System.out.println("아이디 = " + m.id);
		System.out.println("비밀번호 = " + m.pw);
		System.out.println("연락처 = " + m.tel);
	}
}





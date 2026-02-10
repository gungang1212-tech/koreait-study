package chapter09;

public class Member {
	public String id;
	private String pw;
	protected String tel;
	
	public Member() {
		
	}
	
	Member(String id) {
		this.id = id;
	}
	
	Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	Member(String id, String pw, String tel) {
		this.id = id;
		this.pw = pw;
		this.tel = tel;
	}
	
	public void printMemberInfo() {
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
		System.out.println("tel = " + tel);
	}
}






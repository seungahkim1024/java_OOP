package bank01;

public class Member {
	String id, name, ssn, pass; 
	Member(String id,String name, String ssn, String pass){ //필드에선 초기화 할 수 없어서 파라미터에 똑같이 넣는다.
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public String info() {
		return String.format("[회원정보]\n"
				+ "ID: %s\n"
				+ "이름: %s\n"
				+ "주민번호: %s\n"
				+ "비밀번호: %s", id, name, ssn, pass);
	}
	
}

package bank3;

public class Member {
	String name, ssn, id, pass;
	public Member(String name, String ssn, String id, String pass){
		this.name = name;
		this.ssn = ssn;
		this.id = id;
		this.pass = pass;
	}
	public String in(){
		String info = "";
		
		return String.format("이름: %s \n"
				+ "주민번호: %s \n"
				+ "아이디: %s \n"
				+ "비밀번호: %s \n", name, ssn, id, pass);
	}
}

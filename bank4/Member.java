package bank4;

public class Member {
	String id, name, ssn, pass;
	Member(String id, String name, String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
		
	}
	/**
	 * 회원정보 보여주기
	 * */
	public String info(){
		String info = "";
		
		return String.format(
				"이름: %s \n"
				+ "주민등록번호: %s \n"
				+ "ID: %s \n"
				+ "비밀번호: %s \n", name, ssn, id, pass);
	}
}

package bank2;

public class Member {
		String name, ssn, id, pass;
	public Member(String name, String ssn, String id, String pass) {
		this.name = name;
		this.ssn = ssn;
		this.id = id;
		this.pass = pass;
		
		}
	public String info(){
		String res = "";
		
		return String.format(
				"이름: %s \n"
				+"주민번호: %s \n"
				+"ID: %s \n"
				+"비밀번호: %s \n", name, ssn, id, pass);
	}
}

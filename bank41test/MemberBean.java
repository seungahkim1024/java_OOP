package bank41test;

public class MemberBean {
	private String id, name, ssn, pass;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return String.format(
				"ID: %s \n"
				+ "이름: %s \n"
				+ "주민번호: %s \n"
				+ "비밀번호: %s \n", id, name, ssn, pass);
	}
	
}

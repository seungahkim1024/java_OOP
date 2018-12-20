package bank33test;

public class MemberBean {
	private String id, name, ssn, pass;
	public MemberBean(String id, String name, String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public void setId(){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSsn(){
		this.ssn = ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setPass(String newpass){
		this.pass = pass;
	}
	public String getPass(){
		return pass;
	}
	public String toString(){
		String info = "";
		
		return String.format(
				"이름: %s \n"
				+ "주민등록번호: %s \n"
				+ "ID: %s \n"
				+ "비밀번호: %s \n", name, ssn, id, pass);
	}
}

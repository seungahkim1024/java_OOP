package bank41;

public class MemberBean {
	private String id, name, ssn, pass;

	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){ //setter
		this.name=name; // write
	}
	public String getName(){ //getter
		return name; // read
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getPass(){
		return pass;
	}
	public String toString(){
		return String.format(
				"이름: %s \n"
				+ "주민등록번호: %s \n"
				+ "ID: %s \n"
				+ "비밀번호: %s \n", name, ssn, id, pass);
	}
	
}

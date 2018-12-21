package gms31;

public class StudentBean {
	private String hakbun, name, ssn, pass;
	
	public void setHakbun(String hakbun){
		this.hakbun = hakbun;
	}
	public String getHakbun(){
		return hakbun;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
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
	public String toString() {
		return String.format(
				"이름: %s \n"
				+ "학번: %s \n"
				+ "주민등록번호: %s \n"
				+ "비밀번호: %s \n", name, hakbun, ssn, pass);
	}
}

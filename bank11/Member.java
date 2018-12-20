package bank11;

public class Member {
	private String id, name, ssn, pass;
	public Member(String id, String name, String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	/**public void setName(String name){ //setter
		this.name=name; // write
	}  => id는 못바꾸니까 setter를 지우면 변경 불가. */
	public String getName(){ //getter
		return name; // read
	}
	/**public void setSsn(String ssn){
		this.ssn = ssn;
	}*/
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
		String info = "";
		
		return String.format(
				"이름: %s \n"
				+ "주민등록번호: %s \n"
				+ "ID: %s \n"
				+ "비밀번호: %s \n", name, ssn, id, pass);
	}
}

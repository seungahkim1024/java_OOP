package phone;
/**
 * company제조사 삼성
 * call 전화
 * kind 종류 일반전화기
 * */
public class PhoneBean {
	private String kind, company, call;

	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind(){
		return kind;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public String getCompany(){
		return company;
	}
	public void setCall(String call){
		this.call = call;
	}
	public String getCall(){
		return call;
	}
	@Override
	public String toString() {
		return String.format("종류: %s \n"
				+ "제조사: %s \n"
				+ "통화내역: %s", kind, company, call);
	}
	
}

package phone;

public class IPhoneBean extends CellPhoneBean{
	private String data;
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return data;
	}
	public String toString() {
		return String.format(
						"종류: %s \n"
						+"제조사: %s \n"
						+"이동가능성: %s \n"
						+"검색: %s \n", 
						getKind(), // super생략가능.
						getCompany(), 
						getMove(),
						data);
	}
}

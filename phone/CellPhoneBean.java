package phone;

public class CellPhoneBean extends  PhoneBean{
	private String move;
	
		public void setMove(String move){
			this.move = move;
		}
		public String getMove(){
			return move;
		}
		
		@Override
		public String toString() {
		return String.format(
						"종류: %s \n"
						+"제조사: %s \n"
						+"이동가능성: %s \n"
						+ "통화내역: %s", 
						super.getKind(), // super생략가능.
						super.getCompany(), 
						move,
						super.getCall());
	}
}

package car;

public class CarBean {
	private String color, gearType;
	private int door; // 문의 갯수
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setGearType(String gearType){
		this.gearType = gearType;
	}
	public String getGearType(){
		return gearType;
	}
	public void setDoor(int door){
		this.door = door;
	}
	public int getDoor(){
		return door;
	}
	@Override
	public String toString() {
		return String.format("색상: %s \n"
				+ "기어타입: %s \n"
				+ "문 갯수: %d", color, gearType, door);
	}
}

package tv;

public class TVBean {
	private String brand, color;
	private boolean power;
	private int channel, price;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setPower(boolean power){
		this.power = power;
	}
	public boolean getPower(){
		return power;
	}
	public void setChannel(int channel){
		this.channel = channel;
	}
	public int getChannel(){
		return channel;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	@Override
	public String toString() {
		return String.format("tv상태: %s \n"
				+ "채널갯수: %s \n"
				, power, channel);
	}
	public String toString2(){
		return String.format(
				 "브랜드: %s \n"
				+ "색상: %s \n"
				+ "가격: %s \n", brand, color, price);
	}
}

package car;

public interface CarService {

		/**
		 * 판매할 차량을 입고시킨다.*/
	public abstract void add(String brand,String color,String gearType,int door);
	public void list();
	public void find();
	public void sell();
	
}

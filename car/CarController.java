package car;

import javax.swing.JOptionPane;

import bank21.AccountBean;
import bank21.AccountService;
import bank21.MemberBean;

public class CarController {
	public static void main(String[] args){
		CarBean car = null;
		CarService carService = new CarServiceImpl();
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.차량입고 \n"
							+ "2.차량목록 \n"
							+ "3.차량검색 \n"
							+ "4.차량판매 \n")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1":
								String brand = JOptionPane.showInputDialog("입고 브랜드");
								String color = JOptionPane.showInputDialog("차량 색상");
								String gearType = JOptionPane.showInputDialog("기어타입");
								String door = JOptionPane.showInputDialog("문 갯수");
								carService.add(brand,color,gearType,Integer.parseInt(door));
								break;
			}
		}
	}
}

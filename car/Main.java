package car;

import javax.swing.JOptionPane;

import bank21.AccountBean;
import bank21.AccountService;
import bank21.MemberBean;

public class Main {
	public static void main(String[] args){
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.TV작동 \n"
							+ "2.TV정보보기 \n")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1":
								String color = JOptionPane.showInputDialog("색상");
								String gearType = JOptionPane.showInputDialog("기어타입");
								String door = JOptionPane.showInputDialog(Integer.parseInt("문의 갯수"));
								CarBean bean = new CarBean();
								bean.setColor(color);
								bean.setColor(gearType);
								bean.setColor(door);
								JOptionPane.showMessageDialog(null, bean.toString());
								break;
			}
		}
	}
}

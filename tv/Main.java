package tv;

import javax.swing.JOptionPane;

import bank21.AccountBean;
import bank21.AccountService;
import bank21.MemberBean;

public class Main {
	public static void main(String[] args){
		TVBean bean = null;
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.TV작동 \n"
							+ "2.TV정보보기 \n")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1":
								String power = JOptionPane.showInputDialog("on/off");
								String channel = JOptionPane.showInputDialog("채널갯수");
								bean = new TVBean();
								bean.setPower(Boolean.parseBoolean(power));
								bean.setChannel(Integer.parseInt(channel));
								JOptionPane.showMessageDialog(null, bean.toString());
								break;
							case "2":
								String brand = JOptionPane.showInputDialog("브랜드");
								String color = JOptionPane.showInputDialog("색상");
								String price = JOptionPane.showInputDialog("가격");
								bean.setBrand(brand);
								bean.setColor(color);
								bean.setPrice(Integer.parseInt(price));
								JOptionPane.showMessageDialog(null, bean.toString2());
								break;
								
			}
		}
	}
}

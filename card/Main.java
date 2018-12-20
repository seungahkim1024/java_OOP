package card;

import javax.swing.JOptionPane;

import bank21.AccountBean;
import bank21.AccountService;
import bank21.MemberBean;

public class Main {
	public static void main(String[] args){
		CardBean cardbean = null;
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.카드종류, 카드 번호 \n"
							+ "2.카드스펙 \n")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1":
								String kind = JOptionPane.showInputDialog("카드종류");
								String number = JOptionPane.showInputDialog("카드번호");
								cardbean = new CardBean();
								cardbean.setKind(kind);
								cardbean.setNumber(Integer.parseInt(number));
								break;
							case "2":
								JOptionPane.showMessageDialog(null, cardbean.toString());
								break;
								
			}
		}
	}
}

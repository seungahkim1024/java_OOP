package phone;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args){
		PhoneBean phone = null;
		CellPhoneBean bean = null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean aPhone = null;
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.일반폰 \n"
							+ "2.휴대폰 \n"
							+ "3.아이폰 \n"
							+ "4.안드로이드")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1":
								phone = new PhoneBean();
								String kind = JOptionPane.showInputDialog("종류");
								phone.setKind(kind);
								String company = JOptionPane.showInputDialog("어느 회사제품");//금성
								phone.setCompany(company);
								String call = JOptionPane.showInputDialog("통화내용");//안녕
								phone.setCall(call);
								JOptionPane.showMessageDialog(null, phone.toString());
								break;
							case "2":
								bean = new CellPhoneBean();
								kind = JOptionPane.showInputDialog("종류");
								bean.setKind(kind);
								company = JOptionPane.showInputDialog("어느 회사제품");//금성
								bean.setCompany(company);
								String move = JOptionPane.showInputDialog("이동가능성");//이동가능
								bean.setMove(move);
								call = JOptionPane.showInputDialog("통화내용");//안녕
								bean.setCall(call);
								JOptionPane.showMessageDialog(null, bean.toString());
								break;
							case "3":
								iPhone = new IPhoneBean();
								kind = JOptionPane.showInputDialog("종류"); //아이폰
								iPhone.setKind(kind);
								company = JOptionPane.showInputDialog("어느 회사제품");//애플
								iPhone.setCompany(company);
								move = JOptionPane.showInputDialog("이동가능성");//이동가능
								iPhone.setMove(move);
								String data = JOptionPane.showInputDialog("검색내용");//검색 : 노래검색
								iPhone.setData(data);
								JOptionPane.showMessageDialog(null, iPhone.toString());
								break;
							case "4":
								aPhone = new AndroidPhoneBean();
								kind = JOptionPane.showInputDialog("종류"); //아이폰
								aPhone.setKind(kind);
								company = JOptionPane.showInputDialog("어느 회사제품");//애플
								aPhone.setCompany(company);
								move = JOptionPane.showInputDialog("이동가능성");//이동가능
								aPhone.setMove(move);
								String display = JOptionPane.showInputDialog("몇 인치");
								aPhone.setDisplay(display);
								data = JOptionPane.showInputDialog("검색내용");//검색 : 노래검색
								aPhone.setData(data);
								JOptionPane.showMessageDialog(null, aPhone.toString());
								break;
							
			} 
		}
	}
}

package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args){
		Member member = null;
		Account account = null;
		
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴]0.종료 \n"
					+ "1.회원가입 \n"
					+ "2.계좌개설 \n"
					+ "3.계좌조회 \n")){
				case "0": JOptionPane.showMessageDialog(null, "종료"); return;
				case "1": 
					String name = JOptionPane.showInputDialog("이름");
					String ssn = JOptionPane.showInputDialog("주민번호");
					String id = JOptionPane.showInputDialog("아이디");
					String pass = JOptionPane.showInputDialog("비밀번호");
					member = new Member(name, ssn, id, pass);
					String in = member.in();
					JOptionPane.showMessageDialog(null,in);
					break;
				case "2":
					account = new Account(0);
					break;
				case "3":
					String number = account.number(member.name);
					JOptionPane.showMessageDialog(null, number);
					break;
			}
		}
	}
}

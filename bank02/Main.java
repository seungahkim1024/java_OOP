package bank02;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args){
		Account account = null;
		Member member = null;
		
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴]0.종료\n"
					+ "1. 회원가입 \n"
					+ "2. 계좌개설 \n"
					+ "3. 계좌조회 \n")){
			case "0": JOptionPane.showMessageDialog(null, "종료"); return;
			case "1": 
				member = new Member(JOptionPane.showInputDialog("이름 입력"), 
						JOptionPane.showInputDialog("주민번호 입력"), 
						JOptionPane.showInputDialog("ID입력"),
						JOptionPane.showInputDialog("비밀번호 입력"));
				JOptionPane.showMessageDialog(null, member.info());
				break;
			case "2":
				account = new Account(0);
				break;
			case "3":
				String accnum = account.accnum(member.name);
				JOptionPane.showMessageDialog(null, accnum);
				break;
			}
		}
	}
}

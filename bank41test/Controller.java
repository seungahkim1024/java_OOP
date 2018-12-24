package bank41test;

import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

import bank03.Account3;

public class Controller {
	public static void main(String[] args){
		MemberBean member = null; //값이 없고, 받아야하니까 null.
		AccountBean account = null;
		AccountService service = new AccountServiceImpl(); 
		MemberService memberService = new MemberServiceImpl();
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.회원가입 \n"
							+ "2.비번변경 \n"
							+ "3.회원정보보기 \n"
							+ "4.회원목록보기 \n"
							+ "5.ID 찾기 \n"
							+ "6.로그인")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1": 
								memberService.join(JOptionPane.showInputDialog("이름"),
										JOptionPane.showInputDialog("주민등록번호"),
										JOptionPane.showInputDialog("id"),
										JOptionPane.showInputDialog("pass"));
								break;
							case "2":
								String newpass = JOptionPane.showInputDialog("new pass");
								member.setPass(newpass);
								break;
							case"3":
								JOptionPane.showMessageDialog(null, member.toString());
								break;
			}
		}
	}
}

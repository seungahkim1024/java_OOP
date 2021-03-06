package bank21;

import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

import bank03.Account3;

public class Main {
	public static void main(String[] args){
		MemberBean member = null;
		AccountBean account = null;
		AccountService service = new AccountService();
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.회원가입 \n"
							+ "2.계좌개설 \n"
							+ "3.잔액확인 \n"
							+ "4.입금 \n"
							+ "5.출금 \n"
							+ "6.비번변경 \n"
							+ "7.회원정보보기 \n")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1": 
								String name = JOptionPane.showInputDialog("이름");
								String ssn = JOptionPane.showInputDialog("주민번호");
								String id = JOptionPane.showInputDialog("ID");
								String pass = JOptionPane.showInputDialog("pass");
								member = new MemberBean();
								member.setId(id);
								member.setPass(pass);
								member.setName(name);
								member.setSsn(ssn); //순서는 상관 x
								break;
							case "2" :
								account = new AccountBean();
								String accountNum = service.generatorAccountNum();
								account.setAccountNum(accountNum);
								String today = service.today();
								account.setToday(today);
								String sMoney = JOptionPane.showInputDialog("입금액");
								int iMoney = Integer.parseInt(sMoney);
								account.setMoney(iMoney);
								String info2 = service.info(
										account.getAccountNum(), 
										member.getName(), 
										account.getToday(),
										account.getMoney());
								JOptionPane.showMessageDialog(null, info2);
								break;
							case "3":
								String info1 = account.toString();
								JOptionPane.showMessageDialog(null, info1);
								break;
							case "4":
								String inputMoney = JOptionPane.showInputDialog("입금액 입력");
								//String msg = account.deposit(Integer.parseInt(inputMoney)); //account에서 사용하는 money에 입금액을 입력하기 위해 바로 int로 전환해줌
								//JOptionPane.showMessageDialog(null, msg);
								break;

							case "5":
								String outputMoney = JOptionPane.showInputDialog("출금액 입력");
								//String msg1 = account.withdraw(Integer.parseInt(outputMoney)); //account에서 사용하는 money에 입금액을 입력하기 위해 바로 int로 전환해줌
								//JOptionPane.showMessageDialog(null, msg1);
								break;
							case "6":
								String newpass = JOptionPane.showInputDialog("변경 비밀번호 입력");
								member.setPass(newpass);
								break;
							case "7":
								JOptionPane.showMessageDialog(null,member.toString());
								break;
								

			}
			
		}
	}
}

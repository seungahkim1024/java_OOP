package bank41;

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
							+ "2.계좌개설 \n"
							+ "3.잔액확인 \n"
							+ "4.입금 \n"
							+ "5.출금 \n"
							+ "6.비번변경 \n"
							+ "7.회원정보보기 \n"
							+ "8.회원목록보기 \n"
							+ "9.ID 찾기 \n"
							+ "10.로그인 \n"
							+ "11.비밀번호업데이트")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1": 
								memberService.join(JOptionPane.showInputDialog("이름"),
								JOptionPane.showInputDialog("주민번호"),
								JOptionPane.showInputDialog("ID"),
								JOptionPane.showInputDialog("pass"));
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
							case "8":
								//MemberBean[] members = memberService.list();
								//JOptionPane.showMessageDialog(null, members);
								break;
							case "9":
								String id = JOptionPane.showInputDialog("id");
								//JOptionPane.showMessageDialog(null, memberService.find(id));
								break;
							/*case "10":
								id = JOptionPane.showInputDialog("로그인 id");
								String pw = JOptionPane.showInputDialog("비밀번호");
								//boolean ok = memberService.login(id, pw);
								if(ok){
									JOptionPane.showMessageDialog(null, "로그인성공");
								}else{
									JOptionPane.showMessageDialog(null, "로그인 실패");
								}
								//JOptionPane.showMessageDialog(null, (ok)? "로그인 성공" : "로그인실패");
								break;
							case "11":
								id = JOptionPane.showInputDialog("id");
								pw = JOptionPane.showInputDialog("비밀번호");
								String newPass = JOptionPane.showInputDialog("바꿀비밀번호");
								memberService.update(id, pw, newPass); 
								break;*/
			}
		}
	}
}

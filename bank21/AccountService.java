package bank21;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {//service라는 이름을 다들 씀.
	// 서비스 로직에는 멤버변수를 두지 않는다.(지금은)
	public String generatorAccountNum(){
		String account1 = "";
		Random random = new Random();
		for(int i=0; i<8; i++){
			if(i==3){
				account1+=random.nextInt(10)+"-";
			}else{
				account1+=random.nextInt(10);
			}
		}
		return account1;
	}
	public String today(){
		String day = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		day = sdf.format(date);
		return day;
	}
	/**
	 * 입금하기
	 * */
	/*public String deposit(int money){
		String msg = "";
		if(money>0){
			this.money += money;
			msg = "거래완료 \n"+"잔액: "+this.money;
		}else{
			msg = "입금액이 잘못되었거나 잔고가 부족합니다.";
		}
		return msg;
	}	*/
	public String info(String accountNum, 
			String name, String today, int money){
		return String.format(
				"은행이름: %s \n"
				+ "계좌번호: %s \n"
				+ "날짜: %s \n"
				+ "잔액: %d \n", AccountBean.BANK_NAME,// 상수는 클래스이름.상수이름
				accountNum,today,money);
	}
	/**
	 * 출금하기
	 * */
	public String withdraw(int money){
		String msg = "";
			/*if(money > 0 && this.money>=money){
				this.money -= money;
				msg = "거래완료"+this.money;
			}else{
				msg = "입금액이 잘못되었습니다.";
			}*/
		return msg;
	}
	public String jinlee(double a, double b){
		String jinlee="";
		double res = ((0.045/12)*b*a)+a;
		DecimalFormat df = new DecimalFormat("#,##0");
		String a1 = (df.format(res));
		jinlee = String.format("이자는 4.5%%입니다. 받으실 금액은 %s원입니다.",a1);
		return jinlee;
	}
	
}

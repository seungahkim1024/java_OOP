package bank33test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountSurvice {

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
	/*public String withdraw(int money){
		String msg = "";
			if(money > 0 && this.money>=money){
				this.money -= money;
				msg = "거래완료"+this.money;
			}else{
				msg = "입금액이 잘못되었습니다.";
			}
		return msg;
	}
	*/
//	public String toString(String name){
	/*	String info1="";
		return String.format("은행이름: %s \n"
				+ "계좌번호: %s \n"
				+ "날짜: %s \n"
				+ "이름: %s \n"
				//+ "잔액: %s \n", AccountBean.BANK_NAME, accountNum,today,name,money);
*/	}
//}

package bank4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/*
* 계좌 클래스
*[속성]
*상수 : BANK_NAME
*변수 :
*    1. accountNum 계좌번호
*    2. money 잔액
*    3. today 해당일
*[기능]
*    1. generatorAccountNum() : 계좌번호생성(랜덤)
*    2. today() : 해당일생성
*    3. withdraw() 출금하기
*    4. deposit() 입금하기
*    5. info() 계좌정보
* */
public class Account {
	final static String BANK_NAME = "신한은행";
	String accountNum,today;
	int money;
	
	Account(int money){
		this.accountNum = generatorAccountNum();
		this.today = today();
		this.money = money;
	}
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
	public String deposit(int money){
		String msg = "";
		if(money>0){
			this.money += money;
			msg = "거래완료 \n"+"잔액: "+this.money;
		}else{
			msg = "입금액이 잘못되었거나 잔고가 부족합니다.";
		}
		return msg;
	}	
	/**
	 * 출금하기
	 * */
	public String withdraw(int money){
		String msg = "";
			if(money > 0 && this.money>=money){
				this.money -= money;
				msg = "거래완료"+this.money;
			}else{
				msg = "입금액이 잘못되었습니다.";
			}
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
	public String info1(String name){
		String info1="";
		return String.format("은행이름: %s \n"
				+ "계좌번호: %s \n"
				+ "날짜: %s \n"
				+ "이름: %s \n"
				+ "잔액: %s \n", BANK_NAME, accountNum,today,name,money);
	}
	
}

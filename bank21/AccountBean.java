package bank21;

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
public class AccountBean {
	public final static String BANK_NAME = "신한은행";
	private String accountNum,today;
	private int money;
	
	public void setAccountNum(String accountNum){
		this.accountNum = accountNum;
	}
	public String getAccountNum(){
		return accountNum;
	}
	public void setToday(String today){
		this.today = today;
	}
	public String getToday () {
		return today;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	
	
	public String tostring(){
		String info1="";
		return String.format(
				 "계좌번호: %s \n"
				+ "날짜: %s \n"
				+ "잔액: %d \n", accountNum,today,money);
	}
	
}

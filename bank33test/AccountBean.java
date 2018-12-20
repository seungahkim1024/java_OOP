package bank33test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountBean {
	final static String BANK_NAME = "신한은행";
	private String accountNum,today;
	private int money;
	
	public void setAccountNum(){
		this.accountNum = accountNum;
	}
	public String getAccountNum(){
		return accountNum;
	}
	public void setToday(){
		this.today = today;
	}
	public String getToday(){
		return today;
	}
	public void setMoney(){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	
	public String toString(String name){
		String info1="";
		return String.format("은행이름: %s \n"
				+ "계좌번호: %s \n"
				+ "날짜: %s \n"
				+ "이름: %s \n"
				+ "잔액: %s \n", BANK_NAME, accountNum,today,name,money);
	}
	
}

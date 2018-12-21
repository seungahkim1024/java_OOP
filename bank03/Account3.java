package bank03;

import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account3 {
	final static String BANKNAME = "신한은행";
	String accountnum, date;
	int money;
	public Account3(int money){
		this.accountnum = this.randomfor();
		this.date = this.when();
		
	}
	public String randomfor(){
		String count = "";
		Random random = new Random();
		for(int i=0; i<8; i++){
			if(i==3){
				count+=random.nextInt(10)+"-";
			}else{
				count+=random.nextInt(10);
			}
		}
		return count;
	}
	public String when(){
		String day = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		day = sdf.format(date);
		return day;
	}
	
	public String number(String name){
		String res = "";
		return String.format("은행이름: %s \n"
				+ "계좌번호: %s \n"
				+ "날짜: %s \n"
				+ "이름: %s \n"
				+ "잔액: %s \n", BANKNAME, accountnum,date,name,money);
	}
}

//은행, 계좌번호, 날짜, 이름, 잔액
package bank2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Account {
	final static String BANKNAME = "국민은행";
	String accountnumber;
	int money;
	String today;
	Account(int money){
		this.accountnumber = this.randomfor();
		this.money = money;
		this.today = this.day();
	}
	public String randomfor(){
		String number="";
		Random random = new Random();
		for(int i=0; i<8; i++){
			if(i==3){
				number+=random.nextInt(10)+"-";
			}else{
				number+=random.nextInt(10);
			}
		}
		return number;
	}
	public String day(){
		String today="";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	
	public String accnum(String name){
		
		return String.format("은행이름:%s \n"
				+ "계좌번호: %s \n"
				+ "이름: %s \n"
				+ "날짜:%s \n"
				+ "잔 액: %d \n", BANKNAME, accountnumber, name, today, money);
	}

}

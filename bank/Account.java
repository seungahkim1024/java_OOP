package bank;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {
	final static String BANK_NAME = "국민은행";//<-상수. 필드에는 연산자 안돼는데 static 입력하면 연산자 사용가능.
	String accountNum;
	int money; //할당되는게 없어서 객체가 아니다. 그냥 멤버변수
	String today;
	Account(int money){
		this.accountNum = this.generatorAccountNum(); //객체
		this.money = money; //프리미티브는 객체가 될 수 없다.
		this.today = this.today();
	}
	public String generatorAccountNum(){
		String accountNum = "";
		Random random = new Random();
		for(int i=0; i<8;i++){
			if(i==3){
			accountNum += random.nextInt(10)+"-";
			}else{
			accountNum += random.nextInt(10);
			}
		}
		return accountNum;
	}
	public String today(){
		String today="";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	
	public String acc(String name){
		
		return String.format("%s \n"
				+ "계좌번호:%s\n"
				+ "이 름: %s \n"
				+ "날 짜: %s \n"
				+ "잔 액: %d \n", BANK_NAME, accountNum, name, today, money);
	
	}
}

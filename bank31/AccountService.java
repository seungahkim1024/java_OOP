package bank31;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.(지금은)
	public String generatorAccountNum();
	/**
	 * 오늘 날짜 구하기
	 * */
	public String today();
	
	public String deposit(int money);
	
	public String withdraw(int money);
	/**
	 * 계좌정보 보여주기
	 * */
	public String info(String accountNum, 
			String name, String today, int money);
	
}

package bank41;

public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.(지금은)
	
	/**
	 * CREATE
	 * */
	public void createAccount(int money);
	public String generatorAccountNum();
	/**
	 * READ
	 * */
	public AccountBean[] findAll();
	public AccountBean[] findByMemberId(String id);
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public boolean existAccountNum(String accountNum);
	public String info(String accountNum, 
						String name, 
						String today, 
						int money); // 계좌정보 보여주기
	public String today(); // 오늘 날짜 구하기
	/**
	 * UPDATE
	 * */
	public String depositMoney(int money); // 입금하기
	public String withdrawMoney(int money); // 출금하기
	/**
	 * DELETE
	 * */
	public void deleteAccountNum();
}

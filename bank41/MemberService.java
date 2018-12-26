package bank41;

public interface MemberService {
	/**
	 * CREATE
	 * */
	public void join(String id, String name, String ssn, String pass);
	/**
	 * READ
	 * */
	public MemberBean[] findAll();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String Id);
	public boolean existId(String id);
	public boolean existMember(String id, String pw);
	public int countMember();
	/**
	 * UPDATE
	 * */
	public void updatePassword(String id, 
							String pass, 
							String newPass);
	/**
	 * DELETE
	 * */
	public void deleteMember(String id, String pass);
}


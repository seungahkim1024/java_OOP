package bank31;

public class MemberServiceImpl implements MemberService{

	@Override
	public MemberBean join(String id, String name, String pass,String ssn) {
		// TODO Auto-generated method stub
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setSsn(ssn); //순서는 상관 x
		return member;
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	
}

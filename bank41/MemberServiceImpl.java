package bank41;

public class MemberServiceImpl implements MemberService {
	//회원가입
	public MemberBean join(String id, String name, String ssn, String pass){
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setSsn(ssn); //순서는 상관 x
		return null;
	}
	// 로그인
	public void login(){
		
	}
	// 정보 수정
	public void update(){
		
	}
	//회원탈퇴
	public void delete(){
		
	}
}

package bank41test;

public interface MemberService {
	//회원가입
	public void join(String name, String ssn, String id, String pass);
	//---------------------------------------------------------------
	// 목록보기
	public void list();
	// 개인정보 검색
	public void find();
	// 로그인
	public void login();
	// 회원수
	public void count();
	//---------------------------------------------------------------
	// 정보 수정
	public void update();
	//회원탈퇴
	public void delete();
}

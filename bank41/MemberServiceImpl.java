package bank41;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members ; // 필드라서 여기서 초기화 안한다.
	private int count; //은닉화 시키고, 로컬 변수일경우 초기화 되니까 멤버변수로 옮김.
	
	MemberServiceImpl(){
		members = new MemberBean[10];
		count = 0;
	}
	
	public void join(String id, String name, String ssn, String pass){
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setSsn(ssn); //순서는 상관 x
		members[count] = member;
		count ++;
	}
	@Override
	public MemberBean[] list() {
		return members;
	}
	// 로그인
	
	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++){
			if(members[i].getId().equals(id)){
				member = members[i];
				break;
			}
		}
		return member;
	}
	@Override
	public boolean login(String id, String pw) {
		boolean ok = false;
		for(int i=0; i<count; i++){
			if(members[i].getId().equals(id) && members[i].getPass().equals(pw)){
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public int count() {
		return count;
	}
	// 정보 수정
	@Override
	public void update(String pw, String id, String newPass) {
		
		for(int i=0; i<count; i++){
			if(members[i].getId().equals(id) && members[i].getPass().equals(pw)){
				members[i].setPass(newPass);
				break;
			}
		}
	}
	// 회원탈퇴
	public void delete(){
			
		}
}

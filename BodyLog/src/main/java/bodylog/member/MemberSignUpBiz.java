package bodylog.member;

public interface MemberSignUpBiz {

	public int insertUser(MemberDto dto);
	public MemberDto idCheck(String member_id);
}

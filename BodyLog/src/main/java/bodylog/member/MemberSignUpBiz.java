package bodylog.member;

public interface MemberSignUpBiz {

	public int insertUser(MemberDto dto);
	public int idCheck(String member_id);
	public int nickNameCheck(String member_nickname);
	public int phoneCheck(String member_phone);
}

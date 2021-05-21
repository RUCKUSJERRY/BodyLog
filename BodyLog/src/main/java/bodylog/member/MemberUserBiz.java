package bodylog.member;

public interface MemberUserBiz {

	public MemberDto selectUser(int member_num);
	public MemberDto selectPassword(String member_pw);
	public int updateUser(MemberDto dto);
	public int deleteUser(int member_num);
}

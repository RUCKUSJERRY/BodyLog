package bodylog.member;

public interface MemberUserBiz {

	public MemberDto selectUser(int member_num);
	public int updateUser(MemberDto dto);
	public int deleteUser(int member_num);
}

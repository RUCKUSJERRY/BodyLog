package bodylog.member;

import java.util.List;

public interface MemberAdminBiz {

	public List<MemberDto> selectAllUser();
	public List<MemberDto> selectEnabledUser();
	public List<MemberDto> selectunEnabledUser();
	public int updateRole(int member_num, String member_role);
}

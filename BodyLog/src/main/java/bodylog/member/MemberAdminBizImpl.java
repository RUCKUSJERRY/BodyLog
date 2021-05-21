package bodylog.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberAdminBizImpl implements MemberAdminBiz {
	
	@Autowired
	private MemberAdminMapper memberAdminMapper;

	@Override
	public List<MemberDto> selectAllUser() {
		return memberAdminMapper.selectAllUser();
	}

	@Override
	public List<MemberDto> selectEnabledUser() {
		return memberAdminMapper.selectEnabledUser();
	}

	@Override
	public List<MemberDto> selectunEnabledUser() {
		return memberAdminMapper.selectunEnabledUser();
	}

	@Override
	public int updateRole(int member_num, String member_role) {
		return memberAdminMapper.updateRole(member_num, member_role);
	}

}

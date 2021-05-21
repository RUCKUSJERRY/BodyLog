package bodylog.member;

import org.springframework.stereotype.Service;

@Service
public class MemberUserBizImpl implements MemberUserBiz {
	
	private MemberUserMapper memberUserMapper;

	@Override
	public MemberDto selectUser(int member_num) {
		return memberUserMapper.selectUser(member_num);
	}
	
	@Override
	public MemberDto selectPassword(String member_pw) {
		return memberUserMapper.selectPassword(member_pw);
	}

	@Override
	public int updateUser(MemberDto dto) {
		return memberUserMapper.updateUser(dto);
	}

	@Override
	public int deleteUser(int member_num) {
		return memberUserMapper.deleteUser(member_num);
	}

}

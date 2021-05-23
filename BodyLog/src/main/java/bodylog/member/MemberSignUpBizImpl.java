package bodylog.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberSignUpBizImpl implements MemberSignUpBiz {

	@Autowired
	private MemberSignUpMapper memberSignUpMapper;
	
	@Override
	public int insertUser(MemberDto dto) {
		return memberSignUpMapper.insertUser(dto);
	}

	@Override
	public int idCheck(String member_id) {
		return memberSignUpMapper.idCheck(member_id);
	}

	@Override
	public int nickNameCheck(String member_nickname) {
		return memberSignUpMapper.nickNameCheck(member_nickname);
	}

	@Override
	public int phoneCheck(String member_phone) {
		return memberSignUpMapper.phoneCheck(member_phone);
	}

}

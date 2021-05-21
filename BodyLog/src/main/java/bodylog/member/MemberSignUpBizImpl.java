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
	public MemberDto idCheck(String member_id) {
		return memberSignUpMapper.idCheck(member_id);
	}

}

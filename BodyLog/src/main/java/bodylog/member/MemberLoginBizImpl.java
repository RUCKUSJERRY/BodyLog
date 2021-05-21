package bodylog.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberLoginBizImpl implements MemberLoginBiz {

	@Autowired
	private MemberLoginMapper memberLoginMapper;
	
	@Override
	public MemberDto Login(MemberDto dto) {
		return memberLoginMapper.Login(dto);
	}

}

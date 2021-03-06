package bodylog.member;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberLoginMapper {

	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER "
			+ " WHERE MEMBER_ID = #{member_id} AND MEMBER_PW = #{member_pw} ")
	public MemberDto Login(MemberDto dto);
}

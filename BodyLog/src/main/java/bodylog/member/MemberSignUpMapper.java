package bodylog.member;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberSignUpMapper {

	// 회원가입
	@Insert(" INSERT INTO MEMBER VALUES(MEMBERSEQ.NEXTVAL, #{member_id}) ")
	int insertUser(MemberDto dto);
	// 아이디 중복 체크
	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER "
			+ " WHERE MEMBER_ID = #{member_id} ")
	MemberDto idCheck(String member_id);
}

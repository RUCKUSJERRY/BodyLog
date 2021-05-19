package bodylog.member;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberSignUpMapper {

	@Insert(" INSERT INTO MEMBER VALUES(MEMBERSEQ.NEXTVAL, #) ")
	int insertUser(MemberDto dto);
	
	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER "
			+ " WHERE MEMBER_ID = #{member_id} ")
	MemberDto idCheck(String member_id);
}

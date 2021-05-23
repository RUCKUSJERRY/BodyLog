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
	@Select(" SELECT COUNT(*) FROM MEMBER "
			+ " WHERE MEMBER_ID = #{member_id} ")
	int idCheck(String member_id);
	
	// 별명 중복 체크
	@Select(" SELECT COUNT(*) FROM MEMBER "
			+ " WHERE MEMBER_NICKNAME = #{member_nickname} ")
	int nickNameCheck(String member_nickname);
	
	// 전화번호 중복 체크
	@Select(" SELECT COUNT(*) FROM MEMBER "
			+ " WHERE MEMBER_PHONE = #{member_phone} ")
	int phoneCheck(String member_phone);
}

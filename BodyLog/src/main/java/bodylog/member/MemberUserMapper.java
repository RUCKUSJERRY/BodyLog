package bodylog.member;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberUserMapper {
	
	// 내정보 확인
	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER "
			+ " WHERE MEMBER_NUM = #{member_num} ")
	MemberDto selectUser(int member_num);
	
	// 비밀번호 확인
	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER "
			+ " WHERE MEMBER_PW = #{member_pw} ")
	MemberDto selectPassword(String member_pw);
	
	// 내정보 수정
	@Update(" UPDATE MEMBER SET MEMBER_NAME = #{member_name}, MEMBER_NICKNAME = #{member_nickname}, MEMBER_ADDR = #{member_addr}, MEMBER_PHONE = #{member_phone} "
			+ " WHERE MEMBER_NUM = #{member_num} ")
	int updateUser(MemberDto dto);
	
	//회원 탈퇴
	@Delete(" DELETE FROM MEMBER WHERE MEMBER_NUM = #{member_num} ")
	int deleteUser(int member_num);

}

package bodylog.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberAdminMapper {

	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER ")
	List<MemberDto> selectAllUser();
	
	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER WHERE MEMBER_ROLE = 'Y' ")
	List<MemberDto> selectEnabledUser();
	
	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER WHERE MEMBER_ROLE = 'N' ")
	List<MemberDto> selectunEnabledUser();
	
	@Update(" UPDATE MEMBER SET MEMBER_ROLE = #{member_role}, WHERE MEMBER_NUM = #{member_num} ")
	int updateRole(int member_num, String member_role);
}

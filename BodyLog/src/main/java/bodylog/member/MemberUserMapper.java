package bodylog.member;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberUserMapper {
	
	@Select(" SELECT MEMBER_NUM, MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_ADDR, MEMBER_PHONE, MEMBER_ROLE, MEMBER_ENABLED, MEMBER_GENDER FROM MEMBER "
			+ " WHERE MEMBER_NUM = #{member_num} ")
	public MemberDto selectUser(int member_num);
	
	@Update(" UPDATE MEMBER SET  ")
	public int updateUser(MemberDto dto);
	
	
	public int deleteUser(int member_num);

}

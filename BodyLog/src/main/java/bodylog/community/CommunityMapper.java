package bodylog.community;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommunityMapper {

	@Select(" SELECT COM_NUM, COM_NAME FROM COMROOM ")
	List<CommunityDto> selectListCommunity();
	
	@Insert(" INSERT INTO COMROOM VALEUS (COMROOM_SEQ.NEXTVAL, #{com_name} )")
	int insertCommunity(CommunityDto dto);
	
	@Update(" UPDATE FROM COMROOM SET COM_NAME = #{com_name} WHERE COM_NUM = #{com_num} ")
	int updateCommunity(CommunityDto dto);
	
	@Delete(" DELETE FROM COMROOM WHERE COM_NUM = #{com_num} ")
	int deleteCommunity(int com_num);
	
}

package bodylog.community;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommunityMapper {

	@Select("")
	List<CommunityDto> selectListCommunity();
	
	@Insert("")
	int insertCommunity(CommunityDto dto);
	
	@Update("")
	int updateCommunity(CommunityDto dto);
	
	@Delete("")
	int deleteCommunity(int com_num);
	
}

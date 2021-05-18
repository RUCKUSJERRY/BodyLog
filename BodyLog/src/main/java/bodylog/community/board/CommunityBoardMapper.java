package bodylog.community.board;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommunityBoardMapper {

	@Select("")
	List<CommunityBoardDto> selectListCommunityBoard();
	
	@Select("")
	CommunityBoardDto selectOneCommunityBoard(int com_num);
	
	@Insert("")
	int insertCommunityBoard(CommunityBoardDto dto);
	
	@Update("")
	int updateCommunityBoard(CommunityBoardDto dto);
	
	@Delete("")
	int deleteCommunityBoard(int board_num);
	
	
}

package bodylog.community.board;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommunityBoardMapper {

	@Select(" SELECT BOARD_NUM, COM_NUM, MEMBER_NUM, BOARD_TITLE, MEMBER_ID, MEMBER_NICKNAME, BOARD_CONTENT, BOARD_DATE, BOARD_TAG FROM COMBOARD ORDER BY BOARD_NUM DESC ")
	List<CommunityBoardDto> selectListAllCommunityBoard();
	
	@Select(" SELECT BOARD_NUM, COM_NUM, MEMBER_NUM, BOARD_TITLE, MEMBER_ID, MEMBER_NICKNAME, BOARD_CONTENT, BOARD_DATE, BOARD_TAG FROM COMBOARD WHERE COM_NUM = #{com_num} ORDER BY BOARD_NUM DESC ")
	List<CommunityBoardDto> selectListCommunityBoard(int com_num);
	
	@Select(" SELECT BOARD_NUM, COM_NUM, MEMBER_NUM, BOARD_TITLE, MEMBER_ID, MEMBER_NICKNAME, BOARD_CONTENT, BOARD_DATE, BOARD_TAG FROM COMBOARD WHERE BOARD_NUM = #{board_num} ")
	CommunityBoardDto selectOneCommunityBoard(int com_num);
	
	@Insert("")
	int insertCommunityBoard(CommunityBoardDto dto);
	
	@Update(" UPDATE COMBOARD SET "
			+ " BOARD_TITLE = #{board_title} "
			+ " BOARD_CONTENT = #{board_content} "
			+ " WHERE BOARD_NUM = #{board_num} "
			+ " AND MEMBER_NUM = #{member_num} ")
	int updateCommunityBoard(CommunityBoardDto dto);
	
	@Delete("")
	int deleteCommunityBoard(int board_num);
	
	
}

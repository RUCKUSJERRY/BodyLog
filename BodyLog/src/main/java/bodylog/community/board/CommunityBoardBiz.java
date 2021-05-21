package bodylog.community.board;

import java.util.List;

public interface CommunityBoardBiz {

	public List<CommunityBoardDto> selectListAllCommunityBoard();
	public List<CommunityBoardDto> selectListCommunityBoard(int com_num);
	public CommunityBoardDto selectOneCommunityBoard(int board_num);
	public int insertCommunityBoard(CommunityBoardDto dto);
	public int updateCommunityBoard(CommunityBoardDto dto);
	public int deleteCommunityBoard(int board_num);
	
}

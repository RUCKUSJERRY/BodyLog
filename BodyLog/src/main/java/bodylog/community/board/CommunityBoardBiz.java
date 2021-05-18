package bodylog.community.board;

import java.util.List;

public interface CommunityBoardBiz {

	public List<CommunityBoardDto> selectListCommunityBoard();
	public CommunityBoardDto selectOneCommunityBoard(int com_num);
	public int insertCommunityBoard(CommunityBoardDto dto);
	public int updateCommunityBoard(CommunityBoardDto dto);
	public int deleteCommunityBoard(int board_num);
	
}

package bodylog.community.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityBoardBizImpl implements CommunityBoardBiz {

	@Autowired
	private CommunityBoardMapper communityBoardMapper;
	
	@Override
	public List<CommunityBoardDto> selectListCommunityBoard() {
		return communityBoardMapper.selectListCommunityBoard();
	}
	
	@Override
	public CommunityBoardDto selectOneCommunityBoard(int com_num) {
		return communityBoardMapper.selectOneCommunityBoard(com_num);
	}

	@Override
	public int insertCommunityBoard(CommunityBoardDto dto) {
		return communityBoardMapper.insertCommunityBoard(dto);
	}

	@Override
	public int updateCommunityBoard(CommunityBoardDto dto) {
		return communityBoardMapper.updateCommunityBoard(dto);
	}

	@Override
	public int deleteCommunityBoard(int board_num) {
		return communityBoardMapper.deleteCommunityBoard(board_num);
	}


}

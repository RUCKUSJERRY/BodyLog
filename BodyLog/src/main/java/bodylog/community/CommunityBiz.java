package bodylog.community;

import java.util.List;

public interface CommunityBiz {

	public List<CommunityDto> selectListCommunity();
	public int insertCommunity(CommunityDto dto);
	public int updateCommunity(CommunityDto dto);
	public int deleteCommunity(int com_num);
	
}

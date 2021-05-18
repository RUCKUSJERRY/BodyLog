package bodylog.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityBizImpl implements CommunityBiz {

	@Autowired
	private CommunityMapper communityMapper;
	
	@Override
	public List<CommunityDto> selectListCommunity() {
		return communityMapper.selectListCommunity();
	}

	@Override
	public int insertCommunity(CommunityDto dto) {
		return communityMapper.insertCommunity(dto);
	}

	@Override
	public int updateCommunity(CommunityDto dto) {
		return communityMapper.updateCommunity(dto);
	}

	@Override
	public int deleteCommunity(int com_num) {
		return communityMapper.deleteCommunity(com_num);
	}

}

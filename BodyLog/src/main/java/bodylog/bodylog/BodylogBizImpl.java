package bodylog.bodylog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodylogBizImpl implements BodylogBiz {

	@Autowired
	private BodylogMapper mapper;
	
	@Override
	public int insert(BodylogDto dto) {
		// TODO Auto-generated method stub
		return mapper.insert(dto);
	}

	@Override
	public List<BodylogDto> selectList() {
		// TODO Auto-generated method stub
		return mapper.selectList();
	}

	@Override
	public BodylogDto selectOne(int log_seq) {
		// TODO Auto-generated method stub
		return mapper.selectOne(log_seq);
	}

	@Override
	public int update(BodylogDto dto) {
		// TODO Auto-generated method stub
		return mapper.update(dto);
	}

	@Override
	public int delete(int log_seq) {
		// TODO Auto-generated method stub
		return mapper.delete(log_seq);
	}

}

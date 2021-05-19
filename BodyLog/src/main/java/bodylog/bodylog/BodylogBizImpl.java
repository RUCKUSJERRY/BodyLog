package bodylog.bodylog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BodylogBizImpl implements BodylogBiz {

	@Autowired
	private BodylogMapper mapper;
	
	@Override
	public int insert(BodylogDto dto) {
		// TODO Auto-generated method stub
		return mapper.insert(dto);
	}

	@Override
	public List<BodylogDto> bodylogList() {
		// TODO Auto-generated method stub
		return mapper.bodylogList();
	}

	@Override
	public BodylogDto selectCal(int member_no) {
		// TODO Auto-generated method stub
		return mapper.selectCal(member_no);
	}

	@Override
	public int update(BodylogDto dto) {
		// TODO Auto-generated method stub
		return mapper.update(dto);
	}

	@Override
	public int delete(int member_no) {
		// TODO Auto-generated method stub
		return mapper.delete(member_no);
	}

}

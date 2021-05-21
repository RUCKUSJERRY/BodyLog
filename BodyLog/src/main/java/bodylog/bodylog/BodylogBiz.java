package bodylog.bodylog;

import java.util.List;

public interface BodylogBiz {
	public int insert(BodylogDto dto);
	public List<BodylogDto> selectList();
	public BodylogDto selectOne(int log_seq);
	public int update(BodylogDto dto);
	public int delete(int log_seq);
	
	

}

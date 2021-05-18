package bodylog.bodylog;

import java.util.List;

public interface BodylogBiz {
	public int insert(BodylogDto dto);
	public List<BodylogDto> bodylogList();
	public BodylogDto selectCal(int member_no);
	public int update(BodylogDto dto);
	public int delete(int member_no);
	
	

}

package bodylog.bodylog;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BodylogMapper {
	
	@Insert("INSERT INTO ")
	public int insert(BodylogDto dto);
	@Select("SELECT")
	public List<BodylogDto> bodylogList();
	@Select("")
	public BodylogDto selectCal(int member_no);
	@Update("")
	public int update(BodylogDto dto);
	@Delete("")
	public int delete(int member_no);

}

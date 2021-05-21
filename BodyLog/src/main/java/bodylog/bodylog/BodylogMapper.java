package bodylog.bodylog;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BodylogMapper {
	
	@Insert("INSERT INTO BODYLOG VALUES(LOG_SEQ.NEXTVAL,1000,#{log_content},#{log_img},#{log_startday},#{log_endday})")
	public int insert(BodylogDto dto);
	
	@Select("SELECT LOG_SEQ, LOG_CONTENT, LOG_IMG, LOG_STARTDAY, LOG_ENDDAY FROM BODYLOG WHERE MEMBER_NUM=1000")
	public List<BodylogDto> selectList();
	
	@Select("SELECT LOG_SEQ,LOG_CONTENT,LOG_IMG,LOG_STARTDAY,LOG_ENDDAY FROM BODYLOG WHERE LOG_SEQ=#{log_seq}")
	public BodylogDto selectOne(int log_seq);
	
	@Update("UPDATE BODYLOG SET LOG_CONTENT=#{log_content},LOG_IMG=#{log_img},LOG_STARTDAY=#{log_startday},LOG_ENDDAY=#{log_endday} WHERE LOG_SEQ=#{log_seq}")
	public int update(BodylogDto dto);
	
	@Delete("DELETE FROM BODYLOG WHERE LOG_SEQ=#{log_seq}")
	public int delete(int log_seq);

}

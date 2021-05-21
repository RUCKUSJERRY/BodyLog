package bodylog.bodylog;

import java.util.Date;

public class BodylogDto {
	private int log_seq; 
	private int member_num; 
	private String log_content;
	private String log_img; 
	private String log_startday; 
	private String log_endday;
	
	
	public BodylogDto() {
		super();
	}
	
	
	public BodylogDto(int log_seq, int member_num, String log_content, String log_img, String log_startday,
			String log_endday) {
		this.log_seq = log_seq;
		this.member_num = member_num;
		this.log_content = log_content;
		this.log_img = log_img;
		this.log_startday = log_startday;
		this.log_endday = log_endday;
	}
	
	public int getLog_seq() {
		return log_seq;
	}
	public void setLog_seq(int log_seq) {
		this.log_seq = log_seq;
	}
	public int getMember_num() {
		return member_num;
	}
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}
	public String getLog_content() {
		return log_content;
	}
	public void setLog_content(String log_content) {
		this.log_content = log_content;
	}
	public String getLog_img() {
		return log_img;
	}
	public void setLog_img(String log_img) {
		this.log_img = log_img;
	}
	public String getLog_startday() {
		return log_startday;
	}
	public void setLog_startday(String log_startday) {
		this.log_startday = log_startday;
	}
	public String getLog_endday() {
		return log_endday;
	}
	public void setLog_endday(String log_endday) {
		this.log_endday = log_endday;
	} 
	
	
	
	
	
	

}

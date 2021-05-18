package bodylog.bodylog;

import java.util.Date;

public class BodylogDto {
	private int member_num; 
	private String cal_content; 
	private String cal_img; 
	private Date cal_startday;
	private Date cal_endday;
	
	public BodylogDto() {
	}
	
	public BodylogDto(int member_num, String cal_content, String cal_img, Date cal_startday, Date cal_endday) {
		this.member_num = member_num;
		this.cal_content = cal_content;
		this.cal_img = cal_img;
		this.cal_startday = cal_startday;
		this.cal_endday = cal_endday;
	}
	
	public int getMember_num() {
		return member_num;
	}
	
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}
	public String getCal_content() {
		return cal_content;
	}
	public void setCal_content(String cal_content) {
		this.cal_content = cal_content;
	}
	public String getCal_img() {
		return cal_img;
	}
	public void setCal_img(String cal_img) {
		this.cal_img = cal_img;
	}
	public Date getCal_startday() {
		return cal_startday;
	}
	public void setCal_startday(Date cal_startday) {
		this.cal_startday = cal_startday;
	}
	public Date getCal_endday() {
		return cal_endday;
	}
	public void setCal_endday(Date cal_endday) {
		this.cal_endday = cal_endday;
	} 
	
	
	

}

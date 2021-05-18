package bodylog.community.board.comment;

import java.util.Date;

public class CommunityBoardCommentDto {

	private int comment_num;
	private int board_num;
	private int comment_group;
	private int member_num;
	private String member_name;
	private String member_id;
	private String comment_content;
	private Date comment_date;
	
	public CommunityBoardCommentDto() {
		
	}
	
	public CommunityBoardCommentDto(int comment_num, int board_num, int comment_group, int member_num,
			String member_name, String member_id, String comment_content, Date comment_date) {
		this.comment_num = comment_num;
		this.board_num = board_num;
		this.comment_group = comment_group;
		this.member_num = member_num;
		this.member_name = member_name;
		this.member_id = member_id;
		this.comment_content = comment_content;
		this.comment_date = comment_date;
	}

	public int getComment_num() {
		return comment_num;
	}

	public void setComment_num(int comment_num) {
		this.comment_num = comment_num;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public int getComment_group() {
		return comment_group;
	}

	public void setComment_group(int comment_group) {
		this.comment_group = comment_group;
	}

	public int getMember_num() {
		return member_num;
	}

	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getComment_content() {
		return comment_content;
	}

	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}

	public Date getComment_date() {
		return comment_date;
	}

	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}
	
}

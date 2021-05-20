package bodylog.community.board;

import java.util.Date;

public class CommunityBoardDto {

	private int board_num;
	private int com_num;
	private int member_num;
	private String board_title;
	private String member_id;
	private String member_nickname;
	private String board_content;
	private Date board_date;
	
	public CommunityBoardDto() {
		
	}
	
	public CommunityBoardDto(int board_num, int com_num, int member_num, String board_title,
			String member_id, String member_nickname, String board_content, Date board_date) {
		this.board_num = board_num;
		this.com_num = com_num;
		this.member_num = member_num;
		this.board_title = board_title;
		this.member_id = member_id;
		this.member_nickname = member_nickname;
		this.board_content = board_content;
		this.board_date = board_date;
		
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public int getCom_num() {
		return com_num;
	}

	public void setCom_num(int com_num) {
		this.com_num = com_num;
	}

	public int getMember_num() {
		return member_num;
	}

	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_nickname() {
		return member_nickname;
	}

	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public Date getBoard_date() {
		return board_date;
	}

	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	
}

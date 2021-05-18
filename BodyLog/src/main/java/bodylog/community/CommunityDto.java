package bodylog.community;

public class CommunityDto {

	private int com_num;
	private String com_name;
	
	public CommunityDto() {
		
	}
	
	public CommunityDto(int com_num, String com_name) {
		this.com_num = com_num;
		this.com_name = com_name;
	}
	
	public int getCom_num() {
		return com_num;
	}

	public void setCom_num(int com_num) {
		this.com_num = com_num;
	}

	public String getCom_name() {
		return com_name;
	}

	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	
}

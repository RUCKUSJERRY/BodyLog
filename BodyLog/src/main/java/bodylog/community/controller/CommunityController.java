package bodylog.community.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;

import bodylog.common.Util;
import bodylog.community.CommunityBiz;
import bodylog.community.board.CommunityBoardBiz;
import bodylog.community.board.CommunityBoardDto;
import bodylog.community.board.comment.CommunityBoardCommentBiz;

@Controller
@RequestMapping("/community")
public class CommunityController {
	
	Util util = new Util();
	
	@Autowired
	private CommunityBiz comBiz;
	
	@Autowired
	private CommunityBoardBiz comBoardBiz;
	
	//@Autowired
	//private CommunityBoardCommentBiz comBoardCommentBiz;
	
	// 커뮤니티 메인 접속시
	@PostMapping("/selectCommunity")
	public String communityMain(Model model) {
		System.out.println("community-main");
		model.addAttribute("communitylist", comBiz.selectListCommunity());
		
		return "community :: #comarea";
	}
	
	public String communityDetail(Model model) {
		
		return "";
	}
	
	// 모든 커뮤니티의 게시글 리스팅
	@PostMapping("/selectListAllBoard")
	public String selectListAllBoard(Model model) {
		System.out.println("selectListAllBoard");	

		model.addAttribute("boardlist", comBoardBiz.selectListAllCommunityBoard());
		
		return "community :: #boardarea";
		
	}
	
	// 1개 커뮤니티의 게시글 리스팅
	@PostMapping("/selectListBoard")
	public String selectListBoard(Model model, int com_num) {
		System.out.println("selectListBoard");	

		model.addAttribute("boardlist", comBoardBiz.selectListCommunityBoard(com_num));
		
		return "community :: #boardarea";
		
	}
	
	// 1개의 게시글 SELECT
	@PostMapping("/selectOneBoard")
	public String selectOneBoard(Model model, int board_num) {
		System.out.println("selectOneBoard");	
		
		System.out.println(comBoardBiz.selectOneCommunityBoard(board_num).getBoard_title());
		
		model.addAttribute("dto", comBoardBiz.selectOneCommunityBoard(board_num));
		
		return "community :: #boarddetail";
		
	}
	
	// 게시글 UPDATE 모달
		@PostMapping("/insertBoardRes")
		public String insertBoard(Model model, 
				int board_num, int com_num, int member_num, 
				String board_title, String member_nickname, String member_id, String board_content, String board_date) {
			System.out.println("insertBoard");

			System.out.println(comBoardBiz.selectOneCommunityBoard(board_num).getBoard_title());
			
			model.addAttribute("dto", comBoardBiz.selectOneCommunityBoard(board_num));
			
			return "community :: #boardupdate";
			
		}
	
	
	
	// 게시글 UPDATE 모달
	@PostMapping("/updateBoard")
	public String updateBoard(Model model, int board_num) {
		System.out.println("updateBoard");
		
		System.out.println(comBoardBiz.selectOneCommunityBoard(board_num).getBoard_title());
		
		model.addAttribute("dto", comBoardBiz.selectOneCommunityBoard(board_num));
		
		return "community :: #boardupdate";
		
	}
	
	// 게시글 UPDATE RES
	@PostMapping("/updateBoardRes")
	public String updateBoardRes(Model model, 
			int board_num, int com_num, int member_num, 
			String board_title, String member_nickname, String member_id, String board_content, String board_date) {
		System.out.println("updateBoardRes");
		
		CommunityBoardDto dto = new CommunityBoardDto(board_num, com_num, member_num, board_title, member_nickname, member_id, board_content, board_date);

		int res = comBoardBiz.updateCommunityBoard(dto);
		
		if (res > 0) {
			model.addAttribute("dto", comBoardBiz.selectOneCommunityBoard(board_num));
			
			return "community :: #boarddetail";
			
		} else {
			return "community";
		}
		
		
		
		
		
	}
	
	
}


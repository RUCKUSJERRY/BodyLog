package bodylog.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import bodylog.community.CommunityBiz;
import bodylog.community.board.CommunityBoardBiz;
import bodylog.community.board.CommunityBoardDto;
import bodylog.community.board.comment.CommunityBoardCommentBiz;

@Controller
@RequestMapping("/community")
public class CommunityController {

	@Autowired
	private CommunityBiz comBiz;
	
	@Autowired
	private CommunityBoardBiz comBoardBiz;
	
	//@Autowired
	//private CommunityBoardCommentBiz comBoardCommentBiz;
	
	@GetMapping("/main")
	public String communityMain(Model model) {
		System.out.println("community-main");
		model.addAttribute("communitylist", comBiz.selectListCommunity());
		
		return "community-main";
	}
	
	public String communityDetail(Model model) {
		
		return "";
	}
	
	@PostMapping("/selectListAllBoard")
	public String selectListAllBoard(Model model) {
		System.out.println("selectListAllBoard");	
		
		//model.addAttribute("boardlist", comBoardBiz.selectListCommunityBoard());
		
//		List<CommunityBoardDto> list = comBoardBiz.selectListCommunityBoard();
//		Gson gson = new Gson();
//		System.out.println("selectListAllBoard");
//		String jsonString = gson.toJson(list);
//		System.out.println(jsonString);
		model.addAttribute("boardlist", comBoardBiz.selectListCommunityBoard());
		
		return "community-main :: #boardarea";
		
	}
	
}


package bodylog.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bodylog.community.CommunityBiz;
import bodylog.community.board.CommunityBoardBiz;
import bodylog.community.board.comment.CommunityBoardCommentBiz;

@Controller
public class CommunityController {

	@Autowired
	private CommunityBiz comBiz;
	
	//@Autowired
	//private CommunityBoardBiz comBoardBiz;
	
	//@Autowired
	//private CommunityBoardCommentBiz comBoardCommentBiz;
	
	@GetMapping("/community")
	public String communityMain(Model model) {
		System.out.println("communityMain");
		model.addAttribute("communitylist", comBiz.selectListCommunity());
		
		return "community-main.html";
	}
	
}


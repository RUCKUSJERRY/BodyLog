package bodylog.member;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	
	@Autowired
	private MemberSignUpBiz signUpBiz;
	@Autowired
	private MemberLoginBiz loginBiz;
	
	@GetMapping("/main")
	public String main(Model model, String pagename) {

		//String res = "fragments/" + pagename + ".html :: fragment-" + pagename;
		//System.out.println(res);
		model.addAttribute("pagename", pagename);
		
		return "main";
	}

	@GetMapping("/signupform")
	public String SignUpForm() {
		return "signup";
	}
	
	@GetMapping("/signupres")
	public String SignUpRes(MemberDto dto) {
		
		int res = signUpBiz.insertUser(dto);
		if (res > 0) {
			return "redirect:main";
		}
		
		return "redirect:signform";
	}
	
	@GetMapping("loginform")
	public String loginForm() {
		return "login";
	}
	
	@GetMapping("/loginres")
	@ResponseBody
	public Map<String, Boolean> LoginRes(HttpSession session, MemberDto dto) {
		
		MemberDto res = loginBiz.Login(dto);
		boolean check = false;
		
		if (res != null) {
			session.setAttribute("login", res);
			check = true;
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		map.put("check", check);
		
		return map;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index.html";
	}
	
	@GetMapping("/idcheck")
	@ResponseBody
	public String idCheck(String member_id) {
		
		int result = signUpBiz.idCheck(member_id);
		
		if (result != 0) {
			return "false";
		} else {
			return "true";
		}		
	}
	
	@GetMapping("/nicknamecheck")
	@ResponseBody
	public String nickNameCheck(String member_nickname) {
		
		int result = signUpBiz.nickNameCheck(member_nickname);
		
		if (result != 0) {
			return "false";
		} else {
			return "true";
		}	
	}
	
	@GetMapping("/phonecheck")
	@ResponseBody
	public String phoneCheck(String member_phone) {
		
		int result = signUpBiz.phoneCheck(member_phone);
		
		if (result != 0) {
			return "false";
		} else {
			return "true";
		}	
	}
	
	@PostMapping("/jusopopup")
	public String jusoPopup(HttpServletRequest request) {
		
		String inputYn = request.getParameter("inputYn");
		String roadFullAddr = request.getParameter("roadFullAddr");
		String roadAddrPart1 = request.getParameter("roadAddrPart1");
		String roadAddrPart2 = request.getParameter("roadAddrPart2");
		String engAddr = request.getParameter("engAddr");
		String jibunAddr = request.getParameter("jibunAddr");
		String zipNo = request.getParameter("zipNo");
		String addrDetail = request.getParameter("addrDetail");
		String admCd = request.getParameter("admCd");
		String rnMgtSn = request.getParameter("rnMgtSn");
		String bdMgtSn = request.getParameter("bdMgtSn");
		String entX = request.getParameter("entX");
		String entY = request.getParameter("entY");
		
		String confmKey = "U01TX0FVVEgyMDIxMDUyMzAzNDMxNzExMTE5Mjc=";
		
		return "jusopopup";
	}
}

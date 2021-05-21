package bodylog.member;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberSignUpBiz signUpBiz;
	@Autowired
	private MemberLoginBiz loginBiz;

	@GetMapping("/signupform")
	public String SignUpForm() {
		return "signup";
	}
	
	@GetMapping("/signupres")
	public String SignUpRes(MemberDto dto) {
		
		int res = signUpBiz.insertUser(dto);
		if (res > 0) {
			return "redirect:index";
		}
		
		return "redirect:signform";
	}
	
	@GetMapping("loginform")
	public String loginForm() {
		return "login";
	}
	
	@GetMapping("/loginres")
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
}

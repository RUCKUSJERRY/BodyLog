package bodylog.bodylog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bodylog")
public class BodylogController {
	@Autowired
	private BodylogBiz biz;
	
	@GetMapping("/list")
	public String selectList(Model model) {
		model.addAttribute("list", biz.selectList());
		return "bodylog_main";
	}
	@GetMapping("/select")
	public String selectOne(Model model, int log_seq) {
		model.addAttribute("dto", biz.selectOne(log_seq));
		return "bodylog_select";
	}
	
	@GetMapping("/insertform")
	public String insert() {
		return "bodylog_insert";
	}
	@PostMapping("/insertres")
	public String insertres(BodylogDto dto) {
		if(biz.insert(dto)>0) {
			return "redirect:/bodylog/list";
		}
		return "redirect:/bodylog/insertform";
	}
	
	@GetMapping("/updateform")
	public String update(Model model, int log_seq) {
		model.addAttribute("dto", biz.selectOne(log_seq));
		return "bodylog_update";
	}
	
	@PostMapping("/updateres")
	public String updateres(BodylogDto dto) {
		if(biz.update(dto)>0) {
			return "redirect:/bodylog/updateform?log_seq="+dto.getLog_seq();
		}
		return "redirect:/bodylog/list";
	}
	
	@GetMapping("/delete")
	public String delete(int log_seq) {
		if(biz.delete(log_seq)>0) {
			return "redirect:/bodylog/list";
		}
		return "redirect:/bodylog/select?log_seq="+log_seq;
	}
	
	

}

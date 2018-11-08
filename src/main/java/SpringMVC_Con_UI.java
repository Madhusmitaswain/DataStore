import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVC_Con_UI {
	@RequestMapping("/show")
	public String show(ModelMap map) {
		map.addAttribute("eid",12);
		return "Home";
		
	}

}

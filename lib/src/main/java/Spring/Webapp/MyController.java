package Spring.Webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value = "/index.htm")
	public ModelAndView indexPage() {
		ModelAndView mav = new ModelAndView("/WEB-INF/views/index.jsp");
		return mav;
	}
}

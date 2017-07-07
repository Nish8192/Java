package nishant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.portlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;

public class HelloController extends AbstractController {
	
//	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "FIRST JAVA SPRINGMVC PAGE!!!!!");
		
		return modelandview;
	}

}

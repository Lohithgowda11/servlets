package mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("hello")
	private void hello() {
		System.out.println("hello");

	}
	
	@RequestMapping("bye")
	@ResponseBody
	private String bye() {
		
		return "bye";

	}
}

package lt.codeacademy.learn.grupethimeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/index1")
	public String index1() {
		return "index";
	}

	@GetMapping("/index2")
	public String index2() {
		return "index2";
	}

	@GetMapping("/index3")
	public String index3() {
		return "index3";
	}

	@GetMapping("/index5")
	public String index5() {
		return "index5";
	}


	@GetMapping("/index6")
	public String index6() {
		return "index6";
	}

}
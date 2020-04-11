package fr.univ.rouen.stbserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	@GetMapping(value = "/help")
	public String help(ModelMap Model) {
		return "stb.html";
	}
}

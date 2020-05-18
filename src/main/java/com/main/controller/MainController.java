package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/main.do")
	public ModelAndView main() {
		System.out.println("메인 컨트롤러 동작");
		ModelAndView m = new ModelAndView();
		
		return m;
	}
}

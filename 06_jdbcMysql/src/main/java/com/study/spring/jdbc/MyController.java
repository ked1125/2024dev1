package com.study.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
// @Controller하면 controller라는 뜻이에여.. 아 저번에 나왓엇잖아ㅕ;;;;;;;;;;ㅡㅡ
public class MyController {
	
	@Autowired
	//ㅠㅠ
	private MyDAO listDao ;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "jdbc" ;
	}
	
	@RequestMapping("/list")
	public String index(Model model) {
		model.addAttribute("lists",listDao.list());
		return "index" ;
	}
	
}

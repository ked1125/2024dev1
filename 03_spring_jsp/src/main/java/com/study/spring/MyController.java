package com.study.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller // bean 등록 하려면 controller 필요. bean에다 올려놓는거라고 생각하면 됩니당 :<>
public class MyController {
	
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "jsp" ;
	}
	
	@RequestMapping("/test1")
	public String index() {
//		public @ResponseBody String index() {
		return "index";
	}
	
	@RequestMapping("/test2")
	public String test2(Model model) {
		//model 객체를 이용, 데이터 전달 (view->data)
		model.addAttribute("name", "홍길동");
		return "test/test2";	// 폴더 경로명 따라가는듯 :< -- 이부분 다시 한번 확인해보기 :<
	}
	
	@RequestMapping("/mv")
	public ModelAndView test3() {
		ModelAndView mv = new ModelAndView();
		
		List<String> list = new ArrayList<>(); // 제네릭 변수형 나올 때 <> 나옴????:<
		
		list.add("이순신");
		list.add("홍길동");
		list.add("철수");
		list.add("동수");
		
		mv.addObject("lists",list);
		mv.setViewName("view/myview");
		
		return mv;
	}
}

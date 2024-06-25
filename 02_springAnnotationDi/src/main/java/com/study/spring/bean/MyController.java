package com.study.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller						//이게 백엔드 router랑 비슷한 기능?
public class MyController {
	
	@Autowired					// 멤버 가져올 때 써야함...?? :<?
	Member member1 ;
	
	
	@RequestMapping("/")		//request
	public @ResponseBody String root() {		//response_응답값보내는거
		member1.print();
		return "안녕하세요" ;
	}
}

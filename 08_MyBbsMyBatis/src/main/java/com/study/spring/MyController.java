package com.study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.spring.dao.IMyBbsDao;
import com.study.spring.service.IMyBbsService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

//	@Autowired
//	IMyBbsDao dao;
	
	@Autowired
	IMyBbsService bbs;
	
	
	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String listPage(Model model) {
		model.addAttribute("lists", bbs.list());
		//lists는 list.jsp파일의 item과 이름 같아야함
		return "list";
	}
	
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
//		model.addAttribute("작명->xml에서 얘.키 이케씀",dao.viewDao(sId));					// db 실행부분???:<
		model.addAttribute("dto",bbs.view(sId));					// db 실행부분???:<
		
		return "view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		bbs.delete(request.getParameter("id"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) {
		
		bbs.write(request.getParameter("writer"), request.getParameter("title"), request.getParameter("content"));
		// getParameter(인자값) => 인자값은 wirterForm.jsp파일의 input태그의 name="밸류값"이 들어가야함
		
		return "redirect:list";
		
	}
	
	@RequestMapping("/writerForm")
	public String writerForm() {
		return "writerForm";
	}
	
	
}

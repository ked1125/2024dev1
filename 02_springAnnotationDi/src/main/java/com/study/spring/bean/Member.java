package com.study.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component		// 초반에 run할때 쭉 스캔해서 Component가 붙어있는걸 찾아서 bean을 생성해서 confguration에 꽂아넣어놓음
// component는 bean을 등록 하는것
public class Member {
	
	@Value("홍길동")
	private String name ;
	@Value("도사")
	private String nickname ;
	@Autowired					// bean을 의존성주입해주는거 (di)...??? - 참조 클래스에다가 연결해주는거
	// 클래스가 나오면 autowired를 쓴다고 보면 됨!
	// 생성자에도 쓰이고 필드에도 쓰이고 setter에도 쓰임...?:< 근데 생성자로 하는걸 권장하고잇대요?????????????거의다생성자에하고잇대요???
	//의존성 주입을??????????????????:< Di???????????????????????????????????
	//Di랑 관련된 개념이고...
	//@component는 자동으로 bean을 등록해주는거고
	//@Configuration은 수동으로 bean을 등록해주는거고 -> 객체 하나하나에 @bean을 입력해줘야한다는소리임
	@Qualifier("printerA")
	private Printer printer ;	// 참조클래스 여기임 :>
	
	public Member() {

	}
	
	
	public Member(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void print() {
		printer.print("hello " + name + " : " + nickname);
	}
}

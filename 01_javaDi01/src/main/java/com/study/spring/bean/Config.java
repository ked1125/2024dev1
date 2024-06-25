package com.study.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration							// bean담는 바구니?
public class Config {

	@Bean								// 객체 반환으로 추정?
	public Member member1() {	// name 따로 명시 안해주면 자동으로 member1로 bean이름이 자동생성?
		Member member1 = new Member();
		member1.setName("홍길동");
		member1.setNickname("도사");
		member1.setPrinter(new PrinterA());
		return member1;					// 객체 퉤
	}
	
	@Bean(name="han")
	public Member member2() { //원래 bean 이름이 member2로 자동생성되는데,	 han으로 지어줬음	// 반환타입이 void가 아니라 이번엔 Member라는 참조타입
		return new Member("전우치","도사",new PrinterA());
	}
//	@Bean
//	public Member member2() {
//		return new Member("전우치","도사",new PrinterA());
//	}

	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
}

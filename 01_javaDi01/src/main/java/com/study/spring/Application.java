package com.study.spring;

import org.springframework.context.ApplicationContext; // 부모
// Spring 프레임워크의 Ioc컨테이너 인터페이스로, 애플리케이션에서 bean을 관리
import org.springframework.context.annotation.AnnotationConfigApplicationContext; // 자식
// 어노테이션 기반의 설정 클래스를 사용하는 Spring Ioc 컨테이너 구현체

import com.study.spring.bean.Config;
import com.study.spring.bean.Member;
import com.study.spring.bean.Printer;

//@SpringBootApplication
// Spring Boot 애플리케이션의 시작점을 지정
public class Application {
//진입점이 되는 클래스
	
	public static void main(String[] args) {
		//자바 어플리케이션의 메인 메서드로, 프로그램 실행시 가장 먼저 호출
//		SpringApplication.run(Application.class, args);
		//Spring Boot 어플리케이션을 실행하는 코드
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class); // config.java파일이 있겠구나 생각하면댐...!ㅜㅜ
		// 자식 타입의 context를 부모 타입으로 업캐스팅 해줌 (다형성에서 타입은 무조건 좌항만생각하면됨!)
		// 다형성 - context변수가 ApplicationContext 타입이나, 참조하는 객체는 AnnotationConfigApplicationContext클래스의 인스턴스임.
		//Config 클래스를 기반으로 애플리케이션 컨텍스트 생성 - bean들을 관리함.
		//AnnotationConfigApplicationContext가 다 container라고 생각하고 <-하태민
		// 여기에 있는 bean들을 밑에서 context.getBean으로 가져올거임 (매개변수로 객체이름)
		// 총정리 )) context라는 (일종의 객체인데) 컨테이너를 생성하고 -> 인자값 (Config.class) =>요거 config.java 안에 있는 bean을 가져와서 context 컨테이너 안에 넣는다고??
		//240622_15:53_하태민가라사대
		Member member1 = (Member)context.getBean("member1");
		member1.print();
		// context에서 member1이라는 bean을 가져와 Member타입으로 캐스팅
		// member1객체의 print메서드 호출
		
		Member member2 = (Member)context.getBean("han");
		//context에서 han이라는 이름의 bean을 가져와 Member타입으로 캐스팅
		member2.print();
		//member2 객체의 print메서드 호출
//		Member member2 = (Member)context.getBean("member2");
		//member2라는 이름의 bean을 가져와 Member타입으로 캐스팅
//		member2.print();
		
		
		Member member3 = context.getBean("han", Member.class);
		//context에서 han이라는 이름의 bean을 가져와 Member타입으로 캐스팅
		// 제네릭스를 사용하여 타입을 명시적으로 지정...?
		// 싱글톤 스코프로 관리되기 때문에 같은 이름의 Bean을 가져올 경우 동일한 인스턴스를 반환합니다
		member3.print();
		Printer printer = context.getBean("printerB",Printer.class);
		member1.setPrinter(printer);
		member1.print();
	}

}

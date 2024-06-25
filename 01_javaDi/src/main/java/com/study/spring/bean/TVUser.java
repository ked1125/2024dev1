package com.study.spring.bean;

public class TVUser {
	public static void main(String[] args) { 	// main 입력후 ctrl+spacebar
//		LgTv tv = new LgTv();					// new 입력후 ctrl+spacebar
//		SamsungTv tv = new SamsungTv();
//		ITV tv = new SamsungTv();				// 다형성
		
		
		BeanContainer container = new BeanContainer();
//		ITV tv = new LgTv();				// 다형성
		
		ITV tv = (ITV)container.getBean(args[0]) ;	// 업캐스팅
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
	
}

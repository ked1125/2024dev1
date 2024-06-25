package com.study.spring.bean;

public class SamsungTv implements ITV {
	public SamsungTv() {
		System.out.println("samsungTv 생성");
	}
	public void powerOn() {
		System.out.println("samsungTv 켜기");
	} ;				
	public void powerOff() {
		System.out.println("samsungTv 끄기");
	} ;					
	public void volumeUp() {
		System.out.println("samsungTv 소리키우기");
	} ;					
	public void volumeDown() {
		System.out.println("samsungTv 소리줄이기");
	} ;
}

package com.study.spring.bean;

public class SonyTv implements ITV  {
	public SonyTv() {
		System.out.println("sonyTv 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("sonyTv 켜기");
	} ;				
	@Override
	public void powerOff() {
		System.out.println("sonyTv 끄기");
	} ;					
	@Override
	public void volumeUp() {
		System.out.println("sonyTv 소리키우기");
	} ;					
	@Override
	public void volumeDown() {
		System.out.println("sonyTv 소리줄이기");
	} ;
}

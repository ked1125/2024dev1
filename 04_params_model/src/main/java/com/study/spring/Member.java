package com.study.spring;


// @Data -> 어노테이션 임포트 해오면 전부 생략가능함!!! (필드빼고)
// 05_lombok 프로젝트의 Member과 비교해서 공부하기
public class Member {
	private String id ;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

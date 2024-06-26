package com.study.spring.dto;

import lombok.Data;

@Data					// 아웃라인에 올라오는지 확인할것 :> 
// 객체는 맞는데 bean이 아님ㅋ;ㅋㅋ;; - 스프링컨테이너 안에 들어가지 않았다는 의미
public class MyBbsDto {
	private int id;
	private String writer;
	private String title;
	private String content;
	
}

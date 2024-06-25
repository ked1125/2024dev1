package com.study.spring.dto;

import lombok.Data;

@Data					// 아웃라인에 올라오는지 확인할것 :>
public class MyBbsDto {
	private int id;
	private String writer;
	private String title;
	private String content;
	
}

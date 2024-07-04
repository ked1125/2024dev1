package com.study.spring.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor		// 생성자
@NoArgsConstructor		// 기본생성자
public class TestResponseBody {
	String name;
	int age;

}

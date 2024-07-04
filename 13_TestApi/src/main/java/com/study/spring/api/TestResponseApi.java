package com.study.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class TestResponseApi {

	@GetMapping("/test/response/string")
	public String response() {
		return "hello world";
	}

//	@GetMapping("/test/response/json")
//	public String jsonResponse() {
//		return "{\"message\":\"hellow\"}";
//	}

	@GetMapping("/test/response/json")
	public TestResponseBody jsonResponse() {

		/*
		 * // 동일한표현 :> return new TestResponseBody("hanyong5",100);
		 * 
		 * TestResponseBody response = new TestResponseBody("hanyong5",100); return
		 * response;
		 */

		return new TestResponseBody("hanyong5", 100);

//	@Data
//	public static class TestResponseBody{	//TestResponseBody.class파일 만들어주기 귀찮으면 걍이케..:<
//		String name ;
//		int age;
//		public TestResponseBody(String name, int age) {
//			this.name = name;
//			this.age = age;
//		}

	}

}

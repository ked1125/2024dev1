package com.study.spring;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
// "생성자랑 getter setter를 전부 포함하고 있구나라고 생각하면 됨!"

// @Data 주석처리하면 outline에 표시가 안되는데 -> getter, setter, 기본생성자 함수를 합친것
// 전부 포함되어있는 기능이라고 보면된다?
// getter, setter, 생성자-객체생성을 따로 안하고도 ~~~.get___, ~~~.set___등의 메소드를 다른 파일에서 사용할 수 있다
//@Getter
//@Setter
public class Member {
	private String id;
	private String name;
	
	
}


// equals(), hashCode(), toString() - object 타입의 메소드?
//
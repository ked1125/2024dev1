package com.study.spring.jdbc;

import lombok.Data;

@Data				//@data 해주면 (windos-showview-)Outline에서 바로바로 확인가능
					//getter, setter등을 자동으로 선언해주는애인듯? :>
// DTA -> Data transfer object
// 나중에 db넣기 전에 자바 코드로 교환하는건데 뭐라고해야돼 모르겠어요 - 240624_21:00 하태민
// getter와 setter만 가지고 있는 객체?
// dto가 아직 가공이 덜 된 자바코드라고 하는디/???
// 나중에 DTO안에 있는 값들을 setter를 활용해서 바꿔줄 예정?  => 바뀐 값을 entity로 저장?
// ※ db에서 attribute - 속성값 (타원) / relationship - 관계 (마름모) / entity - 객체 (네모)
// db로 가기 전의 객체... (자바코드에서의) - 데이교환을 위한 객체(bean)임!

public class MyDTO {
	int id ;
	String writer ;
	String title ;
	String content ;
}

package com.study.spring.jpa;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "jpamember1")
//@NoArgsConstructor()	// 기본생성자
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자, protected타입 설정
@AllArgsConstructor		// 생성자
//@Getter
//@Setter
@Builder				// 인스턴스 실행시 생성자
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
//	private String content;
	
	@Column(name="create_date")
	private LocalDate createDate;
	
//	public void changeUsename(String usename) {
//		this.usename = usename;
//	}
//	public void changeCreateDate(LocalDate createDate) {
//		this.createDate = createDate;
//	}
	
	
}

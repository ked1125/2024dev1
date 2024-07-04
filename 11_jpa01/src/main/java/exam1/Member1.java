package exam1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JpaMember1") // ㄴ@Table로 테이블명을 직접 지정해줄수도 있다 - 스키마 만드는 작업이라고 보면 됨 :>
public class Member1 { // ㄱ기본적으로는 클래스 명 = 테이블 명이 되는데,
	@Id				// 바로 밑에 있는 Long id만 @Id 어노테이션의 영향을 받음.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 순번이 지정될 수 있도록(autoincrement)
	private Long id;		// Long은 인스턴스 변수값 힙메모리 (bean에있는 메모리 변수값) -> null타입 가능 // long은 스택메모리
	
	
	private String username;
	
	@Column(name="create_date")
	private LocalDate craeateDate;
	
	
	public Member1(){} // 기본생성자 필요함


	public Member1(String username, LocalDate craeateDate) {
		this.username = username;
		this.craeateDate = craeateDate;
	}
	
}

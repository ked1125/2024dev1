package exam1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JpaMember1")
public class Member1_study { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	
	private String username ;
	
	@Column(name="create_date") // column 이름 지정
	private LocalDate createDate ;
	
	public Member1_study() {}	// 기본생성자 필요
	
	public  Member1_study(String username, LocalDate createDate) {
		this.username = username ;
		this.createDate = createDate;
		
	}
}

package exam2;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Data	//를 써주면 -> @Getter, @Setter가 다 포함되어 있고!!
//@Setter	// Setter만 생성해주는거
//@Getter	// Getter만 생성해주는거
@Table(name="JpaMember2") // 테이블 이름 지정. 안할경우 기본값은 클래스이름
public class Member2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Access(AccessType.FIELD)
	private String username;
	
	@Access(AccessType.PROPERTY)
	private String password;
	
	@Transient				// 테이블 생성 x???:<
	private long timestamp1;
	
	public Member2() {}

	public Member2(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

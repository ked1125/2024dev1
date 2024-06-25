package com.study.spring.jdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
// 데이터베이스랑 통신하는 객첸디 나중에 jpa쓰면은 엔티티가 그 역할을 해주겟져;
// 데이터베이스 담당자: @Repository는 데이터를 데이터베이스에서 가져오거나 저장하는 일을 하는 클래스에 붙입니다.
// 스프링에게 알려줌: 스프링한테 "이 클래스는 데이터베이스랑 일해"라고 알려주는 역할을 합니다.
public class MyDAO {
	// 클래스 선언
	// DAO = 데이터 접근 객체??????
	// CRUD 할 때 쓰는 객체? ? ? ? ?  - db랑 소통하는 객체겟지 얘도 ㅡㅡ 어
	
	
	@Autowired
	// 자동으로 의존성 주입 해주는거라고요;예;원래개발자가 직접 입력해줘야되는데
	// @Bean이랑 헷갈리니까 완전 날 경멸햇음 이건 빈등록하는거라고요;;;;
	// @configuration이 컨테이너 만드는거고;;;;
	// spring container가 머예요;;; 얘가 ioc 컨테이너를 한다고요;
	// ioc가 뭐야; 제어의 역전;;;;
	// 제어의 역전이 또 뭐야; 객체가 다른거에 의존하고잇어여; 그 의존 관계를 하나의 매개체를 두고 역전한다고요?;;;
	// 하나의 매개체로 의존성을 줘야한다고 ? 주입해야한다고? <-내가봣을땐 하태민도 이거 잘 모름  240624_21:22
	
	
//	private JdbcTemplate 이름작명가능 ;
	private JdbcTemplate jdbcTemplate ;
	//Jdbc가 어쨋든 옛날 데이터베이스 연결하는 기술이라고요; ;<
	// 필드선언
//	JdbcTemplate = 타입
	
	
	public List<MyDTO> list() {
		// (모르면 나가뒤지라고 하태민이 240624_21:31에 말했음 이거 진짜 뻥아님;;)소드 앞에 있는 타입 -> 반환타입....ㅜㅜ.....나중에 리턴하면 List타입으로 나올거임..ㅜㅜ
		// 메소드선언.... (){}니까....... 제네릭...<MyDTO> 이부분...........
		// List 배열 한 칸 한 칸에 MyDTO라는 타입이 들어가잇ㄷ음;;;;;;머래;ㅋㅋㅋㅋㅋㅋㅋ
//		String query = "select * from mybbs1" ;	
		String query = "select * from mybbs1 order by id desc" ;	
		// sql직접 쓴거잖아;;지금;;;;아;;;;;;;;;;;
		List<MyDTO> list  = jdbcTemplate.query(
				//jdbcTemplate.query()라는 메소드가잇음...함수실행한거네..
				//List = 타입
				// qeury(인자값) 의 인자값이 list에 쏙 들어감...?
				query, new BeanPropertyRowMapper<>(MyDTO.class)
				//연결 시키래 query랑.... MyDTO.class에 있던 4ㄱ대랑..ㅜㅜ
				) ;
		
		return list;
	}
}


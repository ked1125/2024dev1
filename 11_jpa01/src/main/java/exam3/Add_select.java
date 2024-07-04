package exam3;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Add_select {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager entityManager = emf.createEntityManager();

		Member3 user = entityManager.find(Member3.class, "test@test.com");			//find는 Member3.java의 @Id로 지정된 값을 찾는다.
		
		if(user != null) {
			System.out.println("이름 : " + user.getName());
			System.out.printf("생성 :   %tY - %<tm - %<td\n", user.getCreateDate());
		}else {
			System.out.println("데이터 없음!");
		}
		
		
		entityManager.close();
		emf.close();
	}

}

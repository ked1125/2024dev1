package exam3;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Add_update {
//	main + ctrl + spacebar
	public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
			EntityManager entityManager = emf.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			
			
			try {
				transaction.begin();
			
				Member3 user = entityManager.find(Member3.class, "test@test.com");
			
				if(user==null) {
					System.out.println("존재하지 않음");
					transaction.rollback();
					return;
				}
				
				user.changeName("전우치");	//Member3에 있는 함수명
				
				transaction.commit();
				System.out.println("이름 변경 완료");
			} catch (Exception e) {
				e.printStackTrace();
				transaction.rollback();
			} finally {
				entityManager.close();
			}
			
			emf.close();
		
	}

}


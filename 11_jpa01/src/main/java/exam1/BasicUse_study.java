package exam1;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BasicUse_study {

	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
	}
}


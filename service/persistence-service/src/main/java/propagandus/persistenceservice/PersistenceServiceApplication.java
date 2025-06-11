package propagandus.persistenceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PersistenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistenceServiceApplication.class, args);
	}

}

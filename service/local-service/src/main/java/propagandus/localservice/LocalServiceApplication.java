package propagandus.localservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LocalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalServiceApplication.class, args);
	}

}

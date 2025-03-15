package christian.springTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestApplication {
	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(SpringTestApplication.class, args)));
	}
}

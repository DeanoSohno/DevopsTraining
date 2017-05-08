package devops.training;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeandemoApplication {

	@Bean
	public CommandLineRunner cmdRunner() {
		return new	CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				System.out.println("DemoApplication.run");
			}
		};
	}

    public static void main(String[] args) {
        SpringApplication.run(DeandemoApplication.class, args);
    }
}

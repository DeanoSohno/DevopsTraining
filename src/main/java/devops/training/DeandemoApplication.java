package devops.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 


@SpringBootApplication
@RestController
public class DeandemoApplication {

	@GetMapping("/")
	public String hello() {
		return "Hello World again and again";
	}

    public static void main(String[] args) {
        SpringApplication.run(DeandemoApplication.class, args);
    }
}

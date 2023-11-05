package Task_2_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "Task_2_3")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

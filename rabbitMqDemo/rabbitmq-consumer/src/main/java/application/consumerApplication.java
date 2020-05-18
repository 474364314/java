package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
public class consumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(consumerApplication.class, args);

    }
}
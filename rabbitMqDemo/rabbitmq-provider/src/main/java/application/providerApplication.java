package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
public class providerApplication {

    public static void main(String[] args) {
        SpringApplication.run(providerApplication.class, args);

    }
}
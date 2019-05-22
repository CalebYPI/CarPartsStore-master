package za.ac.cput.group3b;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class CarRetailerApplication {

    @Bean
    public RestTemplate restTemplate() { return new RestTemplate(); }

    public static void main(String[] args) { run(CarRetailerApplication.class, args); }
}

package za.ac.cput.group3b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CarRetailerApplication {

    @Bean
    public RestTemplate restTemplate() { return new RestTemplate(); }

    //public static void main(String[] args) { SpringBootApplication.run(CarRetailerApplication.class, args); }
}

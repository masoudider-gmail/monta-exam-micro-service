package montaexamservice.montaexamservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MontaExamServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MontaExamServiceApplication.class, args);
    }

}

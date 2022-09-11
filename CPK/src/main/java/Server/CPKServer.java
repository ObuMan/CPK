package Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class CPKServer {
    public static void main(String[] args) {
        SpringApplication.run(CPKServer.class, args);
    }

}

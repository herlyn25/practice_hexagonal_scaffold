package co.com.pragma.arqclean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@EntityScan(basePackages = {
        "co.com.pragma.arqclean.entities",  // Donde están tus entidades
        "co.com.pragma.arqclean.jpa"        // Si tienes entidades en el adapter
})
@ConfigurationPropertiesScan
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}

package ua.com.skarbmandriv.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ua.com.skarbmandriv.persistence.PersistenceConfiguration;

@Configuration
@EnableAutoConfiguration
@Import({PersistenceConfiguration.class})
@ComponentScan(basePackageClasses = Application.class)
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

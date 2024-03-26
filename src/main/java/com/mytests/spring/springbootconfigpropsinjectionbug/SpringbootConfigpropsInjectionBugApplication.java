package com.mytests.spring.springbootconfigpropsinjectionbug;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ConfigurationPropertiesScan
//@EnableConfigurationProperties(ConfigPropsConfiguration.class)
public class SpringbootConfigpropsInjectionBugApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigpropsInjectionBugApplication.class, args);
    }
@Bean
    public CommandLineRunner commandLineRunner(UseConfigPropsConfiguration service) {
        return args -> {
            System.out.println("--------------------------------------");
            service.display();
            System.out.println("--------------------------------------");
        };
    }
}

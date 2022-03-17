package com.project.SpringSecurity;
import org.hibernate.query.spi.NamedQueryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = NamedQueryRepository.class)
public class SpringSecurityApplication {
public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}

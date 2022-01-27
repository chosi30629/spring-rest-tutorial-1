package spring.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			/*
			 * name 필드 바뀌기 전
			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
			*/
			
			log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
		};
	}
	

}

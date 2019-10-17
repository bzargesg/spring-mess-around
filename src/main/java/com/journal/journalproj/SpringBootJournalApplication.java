package com.journal.journalproj;

import com.journal.journalproj.domain.Journal;
import com.journal.journalproj.repository.JournalRepository;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJournalApplication {

	@Bean
	InitializingBean saveData(JournalRepository repo) {
		return () -> {
			repo.save(new Journal("Get To Know Spring Boot", "Today I will Learn Spring Boot", "01/01/2019"));
			repo.save(new Journal("Second thing", "I'm Saving a Second Thing", "01/02/2019"));
			repo.save(new Journal("Third thing", "I'm Saving a Third Thing", "01/03/2019"));
			repo.save(new Journal("Fourth thing", "I'm Saving a Fourth Thing", "01/04/2019"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}

}

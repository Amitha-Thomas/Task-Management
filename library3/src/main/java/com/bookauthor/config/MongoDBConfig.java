package com.bookauthor.config;

import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.bookauthor.entity.User;
import com.bookauthor.repository.UserRepository;



@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
        	userRepository.save(new User(101, "aiswarya", "aiswarya@gmail.com","passkey"));
        	userRepository.save(new User(102, "aathira", "aathira@gmail.com","password"));
        };
    }
}
package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final PersonRepository repo;

    public DemoApplication(PersonRepository repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        repo.save(new Person("Kai"));

        Person found = repo.findByName("Kai");
        System.out.println("Found person: " + found.getName());
    }
}


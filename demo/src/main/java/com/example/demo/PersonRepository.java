package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // Custom query method: find a Person by their name
    Person findByName(String name);
}

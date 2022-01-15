package com.example.javaApp1.repository;

import com.example.javaApp1.domain.Address;
import com.example.javaApp1.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

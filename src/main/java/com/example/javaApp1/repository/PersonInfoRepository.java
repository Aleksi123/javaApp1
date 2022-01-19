package com.example.javaApp1.repository;

import com.example.javaApp1.domain.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInfoRepository extends JpaRepository<PersonInfo, Long> {
}
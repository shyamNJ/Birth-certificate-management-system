package com.example.springboot8.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BirthRepository extends JpaRepository<BirthCertificate, Integer>{

}

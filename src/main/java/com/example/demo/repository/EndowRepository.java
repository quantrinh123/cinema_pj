package com.example.demo.repository;


import com.example.demo.model.Endow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndowRepository extends JpaRepository<Endow, String> {
}
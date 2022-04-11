package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgeRepository extends JpaRepository<Age, UUID> {
}

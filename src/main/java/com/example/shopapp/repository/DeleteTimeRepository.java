package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.DeleteTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeleteTimeRepository extends JpaRepository<DeleteTime, UUID> {
}

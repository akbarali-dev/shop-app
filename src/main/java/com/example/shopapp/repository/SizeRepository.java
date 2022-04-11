package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SizeRepository extends JpaRepository<Size, UUID> {
}

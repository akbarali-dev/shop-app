package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.Cloth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClothRepository extends JpaRepository<Cloth, UUID> {
}

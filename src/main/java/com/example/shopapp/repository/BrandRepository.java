package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BrandRepository extends JpaRepository<Brand, UUID> {
}

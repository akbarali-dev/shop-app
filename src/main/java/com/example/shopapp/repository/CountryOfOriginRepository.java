package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.CountryOfOrigin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CountryOfOriginRepository extends JpaRepository<CountryOfOrigin, UUID> {
}

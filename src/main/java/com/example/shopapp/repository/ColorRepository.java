package com.example.shopapp.repository;

import com.example.shopapp.model.Color;
import com.example.shopapp.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ColorRepository extends JpaRepository<Color, UUID> {
}

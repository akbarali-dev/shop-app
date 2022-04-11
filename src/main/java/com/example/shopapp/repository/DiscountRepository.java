package com.example.shopapp.repository;

import com.example.shopapp.model.Discount;
import com.example.shopapp.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DiscountRepository extends JpaRepository<Discount, UUID> {
}

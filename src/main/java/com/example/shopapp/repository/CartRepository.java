package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {
}

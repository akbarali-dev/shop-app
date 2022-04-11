package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.SendConfirmPasswordTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SendConfirmPasswordTimeRepository extends JpaRepository<SendConfirmPasswordTime, UUID> {
}

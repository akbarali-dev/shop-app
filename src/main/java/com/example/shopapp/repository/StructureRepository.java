package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StructureRepository extends JpaRepository<Structure, UUID> {
}

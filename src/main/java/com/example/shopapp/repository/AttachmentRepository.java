package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}

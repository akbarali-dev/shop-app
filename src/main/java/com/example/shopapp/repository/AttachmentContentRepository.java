package com.example.shopapp.repository;

import com.example.shopapp.model.Age;
import com.example.shopapp.model.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, UUID> {
}

package com.example.shopapp.repository;

import com.example.shopapp.model.User;
import com.example.shopapp.projection.UserProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(nativeQuery = true,
    value = "select cast(id as varchar),\n" +
            "       phone_number as phoneNumber,\n" +
            "       password,\n" +
            "       full_name as fullName,\n" +
            "       email,\n" +
            "       gender\n" +
            "from users\n" +
            "where lower(email) like lower(concat('%', :search, '%'))")
    Page<UserProjection> getAllUser(Pageable pageable, @Param("search") String search);

    @Query(nativeQuery = true,
            value = "select cast(id as varchar),\n" +
                    "       phone_number as phoneNumber,\n" +
                    "       password,\n" +
                    "       full_name as fullName,\n" +
                    "       email,\n" +
                    "       gender\n" +
                    "from users\n" +
                    "where id = :id")
    UserProjection getUserById(UUID id);

}

package com.example.shopapp.service;


import com.example.shopapp.dto.UserDto;
import com.example.shopapp.model.User;
import com.example.shopapp.payload.ApiResponse;
import com.example.shopapp.projection.UserProjection;
import com.example.shopapp.repository.UserRepository;
import com.example.shopapp.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public HttpEntity getAllUser(int size, int page, String search, String sort, boolean direction) {
        ApiResponse response;
        try {
            Pageable pageable = PageRequest.of(
                    page - 1,
                    size,
                    direction ? Sort.Direction.ASC : Sort.Direction.DESC,
                    sort
            );
            Page<UserProjection> users = userRepository.getAllUser(pageable, search);
            response = new ApiResponse("success", true, users);
            return ResponseEntity.ok(response);
        }catch (Exception e){
            response = new ApiResponse("error", false, null);
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        }
    }

    @Override
    public HttpEntity getUserById(UUID id) {
        return null;
    }

    @Transactional
    @Override
    public HttpEntity saveUser(UserDto user) {
        ApiResponse response;
        try {
            userRepository.save(
                    new User(
                            user.getFullName(),
                            user.getEmail(),
                            user.getPhoneNumber(),
                            user.getPassword()));
            response = new ApiResponse("success", true, null);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response = new ApiResponse("error", false, null);
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        }
    }

    @Override
    public void deleteUserById(UUID id) {

    }
}

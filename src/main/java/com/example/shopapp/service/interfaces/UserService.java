package com.example.shopapp.service.interfaces;

import com.example.shopapp.dto.UserDto;
import org.hibernate.service.UnknownUnwrapTypeException;
import org.springframework.http.HttpEntity;

import java.util.UUID;

public interface UserService {

    HttpEntity getAllUser(int size, int page, String search, String sort, boolean direction);

    HttpEntity getUserById(UUID id);

    HttpEntity saveUser(UserDto user);

    void deleteUserById(UUID id);
}

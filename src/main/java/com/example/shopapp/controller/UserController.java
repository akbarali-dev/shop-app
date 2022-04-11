package com.example.shopapp.controller;


import com.example.shopapp.dto.UserDto;
import com.example.shopapp.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.shopapp.util.Constant.DEFAULT_PAGE_SIZE;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    HttpEntity getAllUser(
            @RequestParam(name = "size", defaultValue = DEFAULT_PAGE_SIZE) int size,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "search", defaultValue = "") String search,
            @RequestParam(name = "sort", defaultValue = "email") String sort,
            @RequestParam(name = "direction", defaultValue = "true") boolean direction) {
        return userService.getAllUser(size, page, search, sort, direction);
    }

    @PostMapping
    HttpEntity saveUser(@RequestBody UserDto user) {
        return userService.saveUser(user);
    }
}

package com.example.shopapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    private String fullName;

    private String password;

    private String email;

    private String phoneNumber;

}
